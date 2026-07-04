package recursion;

public class Pattern1 {
    static void main() {
        pattern1(5,0);
        pattern2(5,0);
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
    static void pattern2(int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            pattern2(r, ++c);
            System.out.print("* ");
        }
        else {
            pattern2(--r, 0);
            System.out.println();
        }
    }
}
