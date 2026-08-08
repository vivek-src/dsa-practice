package recursion;

public class Permutations {
    static void main() {
        printPermutations("", "abc");

    }
    static void printPermutations(String p, String up){
       if (up.isEmpty()){
           System.out.println(p);
           return;
       }
       char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0,i);
            String second = p.substring(i);
            printPermutations(first + ch + second, up.substring(1));
        }
    }
}
