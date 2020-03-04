public class SortOfSort {
    public void sortOfSort(int[] arr) {
        int tempRight = arr.length - 1;
        int tempLeft = 0;
        int n, max, maxInd;

        if(arr.length%4 == 0)
            n = arr.length/4;
        else
            n = arr.length/4 + 1;

        while(n != 0) {
            int tempHoldR = arr[tempRight];
            int tempHoldL = arr[tempLeft];

            if(tempLeft > tempRight)
                break;
            max = findMax(arr, tempLeft, tempRight);
            maxInd = findIndexOfMax(arr, tempLeft, tempRight);
            arr[tempRight] = max;
            if(maxInd != tempRight)
                arr[maxInd] = tempHoldR;
            tempRight--;
            if(tempRight > -1)
                tempHoldR = arr[tempRight];

            if(tempLeft > tempRight)
                break;
            max = findMax(arr, tempLeft, tempRight);
            maxInd = findIndexOfMax(arr, tempLeft, tempRight);
            arr[tempRight] = max;
            if(maxInd != tempRight)
                arr[maxInd] = tempHoldR;
            tempRight--;

            if(tempLeft > tempRight)
                break;
            max = findMax(arr, tempLeft, tempRight);
            maxInd = findIndexOfMax(arr, tempLeft, tempRight);
            arr[tempLeft] = max;
            if(maxInd != tempLeft)
                arr[maxInd] = tempHoldL;
            tempLeft++;
            if(tempLeft < arr.length)
                tempHoldL = arr[tempLeft];

            if(tempLeft > tempRight)
                break;
            max = findMax(arr, tempLeft, tempRight);
            maxInd = findIndexOfMax(arr, tempLeft, tempRight);
            arr[tempLeft] = max;
            if(maxInd != tempLeft)
                arr[maxInd] = tempHoldL;
            tempLeft++;

            n--;
        }
    }//end sortOfSort

    public int findMax(int[] arr, int left, int right) {
        int max = 0;
        int i;
        for(i = left; i <= right; i++) {
            if(arr[i] > max)
                max = arr[i];
        }//end for
        return max;
    }//end findMax

    public int findIndexOfMax(int[] arr, int left, int right) {
        int max = 0;
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

    public void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    /*some code that might work
      public static int findMax(int[] arr, int left, int right) {
    int max = 0;
    //int mid = arr.length/2;
    for(int i = left; i <= right; i++) {
        if(arr[i] > max)
            max = arr[i];
    }//end for
    return max;
  }//end findMax
     */
}//end class


