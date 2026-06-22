package recursion;

public class numberEx {
    static void main() {
        print(1);
    }

    static void print(int n){
        System.out.println(n);
        if(n == 10){
            return;
        }
        print(n+1);
    }
}
