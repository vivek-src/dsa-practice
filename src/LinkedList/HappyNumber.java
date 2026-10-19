//202. Happy Number
// https://leetcode.com/problems/happy-number/description/
package LinkedList;


import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class HappyNumber {

    public static Boolean isHappy(int n){
        int slow = n;
        int fast = n;

        do {
            slow = getDigitsSquare(slow);
            fast = getDigitsSquare(getDigitsSquare(fast));
        }while (fast != slow);

        if (slow == 1){
            return true;
        }
        return false;
    }

    //Using Hash
    public static Boolean isHappyNum(int n){
        HashSet<Integer> visits = new HashSet<>();
        int num = getDigitsSquare(n);
        while (!visits.contains(num)) {
            visits.add(num);
            num = getDigitsSquare(num);

            if (num == 1) {
                return true;
            }
        }
        return false;
    }
    public static int getDigitsSquare(int n){
        int ans = 0;
        while (n != 0){
            int rem = n % 10;
            ans += rem * rem;
            n /= 10;
        }
        return ans;
    }

    static void main() {
        int Num = 19;
        System.out.printf("%d is Happy : %s \n",Num, isHappy(Num));
        System.out.println("Usign HashSet :");
        System.out.printf("%d is Happy : %s",Num, isHappyNum(Num));
    }
}
