package recursion;

import java.util.ArrayList;

public class StringSubseq {
    static void main() {
        String a = "abc";
        PrintSubSeq("" ,a);
        System.out.println();
        System.out.print(RetSubseq("", "abc"));
    }
    static void PrintSubSeq(String p, String up){
        if (up.isEmpty()){
            System.out.print("["+p+"]");
            return;
        }
        char ch = up.charAt(0);
        PrintSubSeq(p  + ch, up.substring(1));
        PrintSubSeq(p, up.substring(1));
    }
    static ArrayList<String> RetSubseq(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> leftReturn =   RetSubseq(p  + ch, up.substring(1));
        ArrayList<String> rightReturn = RetSubseq(p, up.substring(1));

        leftReturn.addAll(rightReturn);

        return leftReturn;
    }
}
