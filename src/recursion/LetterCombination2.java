//  Same Approach written better
package recursion;

public class LetterCombination2 {
    static void main() {
        numPad("","12");
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
}
