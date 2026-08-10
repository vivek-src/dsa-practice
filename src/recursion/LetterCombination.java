// 17. Letter Combinations of a Phone Number
//https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/

package recursion;
import java.util.ArrayList;

public class LetterCombination {
    static void main() {
        ArrayList<String> ans = getCombination("", "2");
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
        for (int i = 0; i < 3; i++) {
            char letter = (char) ('a' + (digit - '2') * 3 + i);
            ArrayList<String> result = getCombination(p + letter, up.substring(1));
            ans.addAll(result);
        }
        return ans;
    }
}
