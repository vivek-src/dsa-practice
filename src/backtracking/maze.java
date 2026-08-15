package backtracking;

public class maze {
    static void main() {
        System.out.println(noOfPaths(3,3));

    }
    static int noOfPaths(int r,int c){
        if(r == 1 || c == 1){
            return 1;
        }
        int left = noOfPaths(r -1 , c);
        int right = noOfPaths(r, c - 1);

        return left + right;

    }
}
