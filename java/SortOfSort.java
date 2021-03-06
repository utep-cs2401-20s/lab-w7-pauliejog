/*
 * Paulie Jo Gonzalez
 * lab-w7
 * MW 1:30 pm
 */

public class SortOfSort {
    public void sortOfSort(int[] arr) {
        int tempRight = arr.length - 1;
        int tempLeft = 0;
        int n = arr.length;
        int max;
        int maxInd;
        int repeat;//condition for the while loop

        if(n%4 == 0)
            repeat = n/4;
        else
            repeat = n/4 + 1;

        for(int i = 0; i < repeat; i--) {
            int tempHoldR = arr[tempRight];

            for(int r = 0; r < 2; r++) {//right side
                if(tempLeft > tempRight)
                    break;
                max = findMax(arr, tempLeft, tempRight);
                maxInd = findIndexOfMax(arr, tempLeft, tempRight);
                arr[tempRight] = max;
                if(maxInd != tempRight)
                    arr[maxInd] = tempHoldR;
                tempRight--;
                if(r == 0) {
                    if(tempRight > -1)
                        tempHoldR = arr[tempRight];
                }

            }//end for
            if(tempLeft > tempRight)
                break;
            ///////////////

            int tempHoldL = arr[tempLeft];
            for(int l = 0; l < 2; l++) {//left side
                if(tempLeft > tempRight)
                    break;
                max = findMax(arr, tempLeft, tempRight);
                maxInd = findIndexOfMax(arr, tempLeft, tempRight);
                arr[tempLeft] = max;
                if(maxInd != tempLeft)
                    arr[maxInd] = tempHoldL;
                tempLeft++;
                if(l == 0) {
                    if(tempLeft < arr.length)
                        tempHoldL = arr[tempLeft];
                }
            }//end for
            if(tempLeft > tempRight)
                break;
        }//end for
    }//end sortOfSort

    public int findMax(int[] arr, int left, int right) {//helper method
        int max = -1000;//assuming that there will be no elements smaller than this value
        for(int i = left; i <= right; i++) {
            if(arr[i] > max)
                max = arr[i];
        }//end for
        return max;
    }//end findMax

    public int findIndexOfMax(int[] arr, int left, int right) {//helper method
        int max = -1000;
        int index = 0;
        for(int i = left; i <= right; i++) {
            if(arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }//end for
        if(left == right)
            index = left;

        return index;
    }//end findIndexOfMax

    public void printArray(int[] arr) {//method to print the array
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }//end printArray
}//end class


