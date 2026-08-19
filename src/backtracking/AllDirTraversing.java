package backtracking;

public class AllDirTraversing {
    static void main() {
        boolean[][] grid = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        printPath("", grid, 0,0 );

    }
    static void printPath(String p, boolean[][] grid, int r, int c){
        // Termination target is reached
        if (r == grid.length-1 && c == grid[0].length-1){
            System.out.println(p);
            return;
        }else if(!grid[r][c]){         // Invalid/visited cell
            return;
        }
        // Current Cell False
        grid[r][c] = false;
        // For Right Movement
        if (c < grid[0].length-1 ){
            printPath(p + "R", grid, r, c+1);
        }
        // For Down Movement
        if(r < grid.length - 1){
            printPath(p + "D", grid, r+1, c);
        }
        //For Left Movement
        if (c > 0){
            printPath(p + "L", grid, r, c-1);
        }
        // For Up Movement
        if (r > 0){
            printPath(p + "U", grid, r-1, c);
        }
        //Restore cell for next call
        grid[r][c] = true;

    }
}
