public class SortOfSort {
    public void sortOfSort(int[] arr) {
        int tempRight = arr.length - 1;
        int tempLeft = 0;

        while(tempLeft < tempRight) {
            int tempHoldR = arr[tempRight];
            int tempHoldL = arr[tempLeft];

            arr[tempRight] = findMax(arr,tempLeft,tempRight);
            arr[findIndexOfMax(arr,tempLeft,tempRight)] = tempHoldR;
            tempRight--;
            tempHoldR = arr[tempRight];

            arr[tempRight] = findMax(arr,tempLeft,tempRight);
            arr[findIndexOfMax(arr,tempLeft,tempRight)] = tempHoldR;
            tempRight--;
            tempHoldR = arr[tempRight];

            arr[tempLeft] = findMax(arr,tempLeft,tempRight);
            tempLeft++;
            arr[tempLeft] = findMax(arr,tempLeft,tempRight);
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
        return index;
    }//end findIndexOfMax

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


