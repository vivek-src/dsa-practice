package backtracking;

public class maze {
    static void main() {
//        System.out.println(noOfPaths(3,3));
        printPaths("",3,3);
    }
    static int noOfPaths(int r,int c){
        if(r == 1 || c == 1){
            return 1;
        }
        int left = noOfPaths(r -1 , c);
        int right = noOfPaths(r, c - 1);

        return left + right;

    }
    static void printPaths(String p, int r, int c){
        if (r == 1 && c == 1){
            System.out.println(p);;
        }
        if(c > 1){
            printPaths(p+"R", r, c-1);
        }
        if(r > 1){
            printPaths(p+"D", r-1, c);
        }
    }
}
