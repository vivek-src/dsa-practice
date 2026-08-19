package backtracking;

import java.util.Arrays;

public class AllDirTraversing {
    static void main() {
        boolean[][] grid = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] path  = new int[grid.length][grid[0].length];
//        printPath("", grid, 0,0 );
        printGrid("",grid,0,0, path, 0);

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
    static void printGrid(String p, boolean[][] grid, int r, int c, int[][] path, int step){
        // Termination target is reached
        if (r == grid.length-1 && c == grid[0].length-1){
            System.out.println(p);
            for (int[] row : path){
                System.out.println(Arrays.toString(row));
            }
            System.out.println();
            return;
        }else if(!grid[r][c]){         // Invalid/visited cell
            return;
        }
        grid[r][c] = false;
        path[r][c] = step;

        if (c < grid[0].length-1 ){
            printGrid(p + "R", grid, r, c+1, path, step+1);
        }

        if(r < grid.length - 1){
            printGrid(p + "D", grid, r+1, c, path, step+1);
        }

        if (c > 0){
            printGrid(p + "L", grid, r, c-1, path, step+1);
        }

        if (r > 0){
            printGrid(p + "U", grid, r-1, c, path, step+1);
        }
        grid[r][c] = true;
        path[r][c] = 0;

    }
}
