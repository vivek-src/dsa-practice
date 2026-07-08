package recursion;

import java.util.Arrays;

public class MergeSort {
    static void main() {
        int[] arr = {5,3,8,93,12,45};
        arr = sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] sort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = sort(Arrays.copyOfRange(arr, 0 , mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));
        
        return merge(left, right);
        
    }

    private static int[] merge(int[] first, int[] second) {
        int[] merge = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < first.length && j < second.length){
            if(first[i] < second[j]) {
                merge[k] = first[i];
                i++;
            } else  {
                merge[k] = second[j];
                j++;
            }
            k++;
        }

        // if array are not equal copy remaining elements
        while (i < first.length){
            merge[k] = first[i];
            i++; k++;
        }
        while (j < second.length){
            merge[k] = second[j];
            j++; k++;
        }
        return merge;
    }
}
