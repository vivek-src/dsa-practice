package recursion;

public class CheckArray {
    static void main() {
        int[] arr = {1,2,4,5,7,8};
        System.out.println(checkSorting(arr,0));

    }
    static boolean checkSorting(int arr[], int index){
        if(index == arr.length-1){
            return  true;
        }
        return arr[index]  < arr[index+1] && checkSorting(arr, ++index);
    }
}
