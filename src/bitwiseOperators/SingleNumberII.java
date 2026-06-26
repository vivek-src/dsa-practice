//137. Single Number II
//https://leetcode.com/problems/single-number-ii/description/
package bitwiseOperators;

public class SingleNumberII {
    static void main() {
        int[] arr = {5,5,3,5,1,1,1,4,4,4,2,2,2};
        System.out.println("The number appearing single time : "+check(arr));

    }
    static int check(int[] arr){
        int res = 0;
        for (int i = 0; i < 8; i++) {
            int count = 0;
            for(int n: arr){
                if(((n  >> i) & 1) == 1){
                    count += 1;
                }
            }
            if(count % 3 == 1){
                res |= (1 << i);
            }

        }
        return res;
    }
}
