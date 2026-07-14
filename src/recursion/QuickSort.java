package recursion;

import java.util.Arrays;

public class QuickSort {
    static void main() {
        int[] arr = {8,2,4,2,13,3,6,12,45};
        quickSort(arr, 0 , arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static void quickSort(int[] nums, int lo, int hi){
        if(lo >= hi){
            return;
        }
        int start = lo; int end = hi;
        int mid = start + (end - start) /2;
        int pivot = nums[mid];
        while (start < end){
            while (nums[start] < pivot){
                start++;
            }
            while (nums[end] > pivot){
                end--;
            }
            if (start <= end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++; end--;
            }
        }
        // Pivot is in correct position now, recursive call for array subparts
        quickSort(nums, lo, end );
        quickSort(nums, start, hi);
    }
}
