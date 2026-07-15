package recursion;

import javax.xml.transform.Source;

public class SkipWord {
    static void main() {
        System.out.println(SkipApple("The red apple fell from the tree."));

    }
    static String SkipApple(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("apple")){
            return s.substring(5);
        }
        return s.charAt(0) + SkipApple(s.substring(1));
    }
}
