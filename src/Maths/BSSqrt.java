//69. Sqrt(x)
//Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
//You must not use any built-in exponent function or operator.
//https://leetcode.com/problems/sqrtx/description/
package Maths;

public class BSSqrt {
    static void main() {
        int n = 20;
        int precision = 3;
        double sqrt = findSqrt(n, precision);
        System.out.printf("%.3f",sqrt);

    }
    static double findSqrt(int n, int precison){
        int start = 0;
        int end = n;
        while (start <= end){
            int mid = start +  (end - start) / 2;

            if(mid * mid == n){
                return mid;
            }else if(mid * mid > n){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        double root = end;
        double inc = 0.1;
        for (int i = 0; i < precison; i++) {
            while (root * root <= n){
                root += inc;
            }
            root -= inc;
            inc /= 10;
        }
        return root;
    }
}
