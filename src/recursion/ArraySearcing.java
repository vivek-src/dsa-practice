package recursion;

public class ArraySearcing {
    static void main() {
        int[] arr = {1,2,4,5,6,9,12};
        int ans = findElement(arr, 9, 0);
        System.out.print(ans);

    }
    static int findElement(int[] arr, int target, int index){
        if(index > arr.length-1){
            return -1;
        }
        else if (arr[index] == target){
            return index;
        }
        return findElement(arr, target, ++index);



    }
}
