package recursion;

public class RBS {
    static void main() {
        int[] arr = {5,6,7,8,9,1,2,3};
        System.out.println("Index of 9 in arr : "+rbSearch(arr, 9, 0, arr.length-1));

    }
    static int rbSearch(int[] arr, int target, int start, int end) {

        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[start] <= arr[mid]) {

            if (target >= arr[start] && target < arr[mid]) {
                return rbSearch(arr, target, start, mid - 1);
            }

            return rbSearch(arr, target, mid + 1, end);
        }

        if (target > arr[mid] && target <= arr[end]) {
            return rbSearch(arr, target, mid + 1, end);
        }

        return rbSearch(arr, target, start, mid - 1);
    }
}
