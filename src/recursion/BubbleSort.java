package recursion;

import java.util.Arrays;

public class BubbleSort {
    static void main() {
        int[] arr = {3,4,5,2,8,1};
        sort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
    //Iterative Approach is better
    static void sort(int[] arr, int r, int c){
        if (r == 0){
            return;
        }else if(c < r){
            if (arr[c] > arr[c+1]){
                //swap
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
                sort(arr, r, ++c);
            return;
        }
        sort(arr, --r,0);
    }
}
