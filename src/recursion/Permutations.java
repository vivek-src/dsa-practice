package recursion;

import java.util.ArrayList;
public class Permutations {
    static void main() {
        printPermutations("", "abc");
        System.out.println(Permutation("", "abc"));

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

    static ArrayList<String> Permutation(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String first = p.substring(0,i);
            String second = p.substring(i);
            ans.addAll(Permutation(first + ch + second, up.substring(1)));
        }
        return  ans;
    }
}
