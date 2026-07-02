package Maths;

public class GCD_LCM {
    static void main() {
        System.out.printf("GCD of %d and %d is : %d", 4,9,getGCD(4,9));
        System.out.println();
        System.out.printf("LCM of %d and %d is : %d", 4,9,getLCM(4,9));
    }
    static int getGCD(int a, int b){
        if (a == 0){
            return b;
        }
        return getGCD( b%a , a);
    }

    static int getLCM(int a, int b){
        return a * b / getGCD(a, b);
    }
}
