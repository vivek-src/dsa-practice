package recursion;

public class FactorialN {
    static void main() {
        System.out.println(factorial( 10));

    }
    static int factorial(int n ){
        if (n == 1){
            return 1;
        }
        return n * factorial(n - 1) ;

    }
}
