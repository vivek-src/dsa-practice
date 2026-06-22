package stringBuilder;

public class CheckPalindrome {
    static void main() {
        String str = "Radar";
        if (checkPalindrome(str)) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is not a Palindrome");
        }

    }
    static boolean checkPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        str = str.toLowerCase();
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) == (str.charAt(end))) {
                start++;
                end--;
            }else  {
                return false;
            }
        }
        return true;
    }
}
