package bitwiseOperators;

public class getAndSetBit {
    static void main() {
        int num = 10;
        System.out.println(getBit(num,2));
        setBit(num, 2);
    }
    static int getBit(int n, int pos){
        return (n >> pos) & 1;
    }
    static void setBit(int n, int pos){
        int mask = 1 << pos;
        n |= mask;
        System.out.println(getBit(n, 2));
    }

}
