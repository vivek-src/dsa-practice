package recursion;

public class CountZeroes {
    static void main() {
        int n = 1900390;
        int ans = countZ(n, 0);
        System.out.println(ans);
    }

    private static int countZ(int n, int count) {
        if(n == 0){
            return count;
        }else if(n % 10 == 0){
            return countZ(n / 10, ++count);
        }
        return countZ(n / 10, count);
    }
}
