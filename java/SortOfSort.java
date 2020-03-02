public class SortOfSort {
    public void sortOfSort(int[] arr) {
        int tempRight = arr.length - 1;
        int tempLeft = 0;
        int next = arr.length;
        while(next > 0) {
            arr[tempRight] = findMax(arr)

        }

    }//end sortOfSort

    public int findMax(int[] arr, int left, int right) {
        int max = 0;
        for(int i = left; i <= right; i++) {
            if(arr[i] > max)
                max = arr[i];
        }//end for
        return max;
    }//end findMax

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


