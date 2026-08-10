// 17. Letter Combinations of a Phone Number
//https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/

package recursion;
import java.util.ArrayList;

public class LetterCombination {
    static void main() {
        ArrayList<String> ans = getCombination("", "8");
        System.out.println(ans);

    }
    static ArrayList<String> getCombination(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        char digit = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        int start = (digit - '2') * 3;

        if (digit > '7') {
            start++;
        }

        int end = (digit == '7' || digit == '9') ? 4 : 3;
        for (int i = 0; i < end; i++) {
            char letter = (char) ('a' + start + i);
            ArrayList<String> result = getCombination(p + letter, up.substring(1));
            ans.addAll(result);
        }
        return ans;
    }
}
