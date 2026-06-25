package bitwiseOperators;

public class checkSingle {
    static void main() {
        int[] arr = {1,3,6,5,1,3,6};
        System.out.printf("Non Repeating Element in the Array : %d",check(arr));

    }
    static int check(int[] arr){
        int temp = 0;
        for(int i : arr){
            temp ^= i;
        }
        return temp;
    }
}
