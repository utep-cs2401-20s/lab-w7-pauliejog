public class SortOfSort {
    public void sortOfSort(int[] arr) {
        int tempRight = arr.length - 1;
        int tempLeft = 0;

        //int track = arr.length;
        int n = arr.length/4;
        int max, maxInd;
        while(n != 0) {
            int tempHoldR = arr[tempRight];
            int tempHoldL = arr[tempLeft];

            max = findMax(arr, tempLeft, tempRight);
            maxInd = findIndexOfMax(arr, tempLeft, tempRight);
            arr[tempRight] = max;
            if(maxInd != tempRight)
                arr[maxInd] = tempHoldR;
            tempRight--;
            tempHoldR = arr[tempRight];

            max = findMax(arr, tempLeft, tempRight);
            maxInd = findIndexOfMax(arr, tempLeft, tempRight);
            arr[tempRight] = max;
            if(maxInd != tempRight)
                arr[maxInd] = tempHoldR;
            tempRight--;
            //tempHoldR = arr[tempRight];

            max = findMax(arr, tempLeft, tempRight);
            maxInd = findIndexOfMax(arr, tempLeft, tempRight);
            arr[tempLeft] = max;
            if(maxInd != tempLeft)
                arr[maxInd] = tempHoldL;
            tempLeft++;
            tempHoldL = arr[tempLeft];

            max = findMax(arr, tempLeft, tempRight);
            maxInd = findIndexOfMax(arr, tempLeft, tempRight);
            arr[tempLeft] = max;
            if(maxInd != tempLeft)
                arr[maxInd] = tempHoldL;
            tempLeft++;
            //tempHoldL = arr[tempLeft];

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


