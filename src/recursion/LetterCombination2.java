//  Same Approach written better
package recursion;

import java.util.ArrayList;

public class LetterCombination2 {
    static void main() {
//        numPad("","12");
        ArrayList<String> charCombo = numPadCombo("", "12");
        System.out.println(charCombo);
    }
    static void numPad(String p, String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        int digit = up.charAt(0) - '0'; //Get the Int value of char at 0
        for (int i = (digit - 1)*3; i < digit * 3 ; i++) {
            char ch = (char) ('a' + i);
            numPad(p + ch, up.substring(1));
        }
    }
    static ArrayList<String> numPadCombo(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        int digit = (char) up.charAt(0) - '0';
        ArrayList<String> ans = new ArrayList<>();
        for (int i = (digit - 1 )*3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            ArrayList<String> branch = numPadCombo(p + ch, up.substring(1));
            ans.addAll(branch);
        }
        return ans;
    }
}
