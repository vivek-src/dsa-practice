package recursion;

public class SumofDigits {
    static void main() {
        System.out.println(sum(1342));
        System.out.println(product(123));
    }
    static int  sum(int n ){
        if (n == 0){
            return 0;
        }
        return sum(n / 10) + (n % 10);
    }
    static int product(int n ){
        if (n%10 == n){
            return n;
        }
        return product(n / 10) * (n % 10);
    }
}
