package recursion;

import java.util.Arrays;

public class SelectionSort {
    static void main() {
        int[] arr = {8,9,34,4,13,5,1};
        sort(arr,arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int[] arr, int r, int c, int max){
        if(r == 0){
            return;
        } else if (c < r) {
            if(arr[c]  > arr[max]){
                max = c;
            }
            sort(arr, r, ++c,max);
            return;
        }
        int temp = arr[r];
        arr[r] = arr[max];
        arr[max] = temp;

        sort(arr, --r,0,0);
    }
    static void selectionSort(int[] arr, int end) {
        if (end == 0) {
            return;
        }
        int maxIndex = findMax(arr, end, 0);

        int temp = arr[end];
        arr[end] = arr[maxIndex];
        arr[maxIndex] = temp;

        selectionSort(arr, end - 1);
    }

    static int findMax(int[] arr, int end, int currentMax) {
        if (end == 0) {
            return currentMax;
        }
        if (arr[end] > arr[currentMax]) {
            currentMax = end;
        }
        return findMax(arr, end - 1, currentMax);
    }
}
