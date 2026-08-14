package recursion;

public class DicethrowCombo {
    static void main() {
//        getCombo("",4);
        System.out.println(getNoRolls("", 6, 3));

    }
    static void getCombo(String p, int target){
        if( target == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <=6 && i <= target; i++) {
            getCombo(p + i, target - i);
        }
    }
    static int getNoRolls(String p, int side,int target){
        if(target == 0){
            return 1;
        }
        int ans = 0;
        for (int i = 1; i <= side && i <= target; i ++){
            ans += getNoRolls(p + i, side, target - i);
        }
        return ans;
    }
}
