package recursion;

public class Subset {
    static void main() {
        String a = "abaccabgcd";
        System.out.println(a);
        findSubset(a,"Subset : ");

    }
    static void findSubset(String s, String ans) {
        if(s.isEmpty()){
            System.out.println(ans);
            return;
        }
        if (s.charAt(0) != 'a') {
            ans += s.charAt(0);
        }
        findSubset(s.substring(1),ans);
    }
}
