public class SortOfSort {
    public void sortOfSort(int[] arr) {

    }//end sortOfSort

    public int findMax(int[] arr, int a) {//will find next max given the previous max value, first pass a = 0
        int max = arr[0];
        if(max == a)
            max = arr[1];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max && arr[i] != a)
                max = arr[i];
        }//end for
        return max;
    }//end findMax
}//end class


