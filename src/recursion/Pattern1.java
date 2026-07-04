package recursion;

public class Pattern1 {
    static void main() {
        pattern1(5,0);
    }
    static void pattern1(int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            System.out.print("* ");
            pattern1(r, ++c);
        }
        else {
            System.out.println();
            pattern1(--r, 0);
        }
    }
}
