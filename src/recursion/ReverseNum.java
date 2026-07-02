//https://leetcode.com/problems/reverse-integer/description/
//7. Reverse Integer (Recursion is not the best approach, Iteration would be better)

package recursion;

public class ReverseNum {
    static void main() {
        int n = 12321;
        System.out.println(reverse(n,  0));
        System.out.printf("%d is Palindrome : %s",n,isPalindrome(n));
    }
    static int reverse(int n, int rev){
        if (Math.abs(rev) >= Integer.MAX_VALUE){
            return 0;
        }
        if ( n == 0){
            return rev;
        }
//        System.out.println(rev);
        return reverse(n / 10, rev * 10 + n % 10);
    }
    static boolean isPalindrome(int n){
        return n == reverse(n, 0);
    }
}
