package bitwiseOperators;

public class XORofN {
    static void main() {
        System.out.println(getXOR(7));
        int start = 3;
        int end = 20;
        System.out.printf("XOR from %d to %d is: %d",start,end,getXOR(start,end));
    }
    static int getXOR(int n) {
        return switch (n % 4) {
            case 0 -> n;
            case 1 -> 1;
            case 2 -> n + 1;
            default -> 0;
        };
    }

    static int getXOR(int a, int b) {
        return getXOR(b) ^ getXOR(a - 1);
    }
}
