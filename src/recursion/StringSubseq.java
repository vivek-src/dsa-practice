package recursion;

public class StringSubseq {
    static void main() {
        String a = "abc";
        PrintSubSeq("" ,a);
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
}
