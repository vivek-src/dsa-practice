package bitwiseOperators;

public class NoofDigits {
    static void main() {
        int a = 10;
        int base = 2;

        int n = (int)(Math.log(a) / Math.log(base) )+1;
        System.out.println("Number of Digits : "+n);
    }
}
