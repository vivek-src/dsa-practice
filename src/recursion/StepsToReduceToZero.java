//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
// 1342. Number of Steps to Reduce a Number to Zero
// I think Iterative will be a better approach For - Future Vivek
package recursion;

public class StepsToReduceToZero {
    static void main() {
        System.out.println(countSteps(41));
    }
    static int countSteps(int num){
        return helper(num, 0);
    }
    static int helper(int n, int steps){
        if(n == 0){
            return steps;
        }if(n % 2 == 0){
            return helper(n/2, ++steps );
        }
        return helper(n -1, ++steps );
    }
}
