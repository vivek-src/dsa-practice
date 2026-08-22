//https://leetcode.com/problems/n-queens/description/
// 51. N-Queens
package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Nqueens {
    static void main() {
        int n = 4;
        boolean[][] board = new boolean[n][n];
//        placeQueens(board, 0);
        List<List<String>> result = new ArrayList<>();
        queensSol(board, 0, result);
        System.out.println(result);
    }
    static void placeQueens(boolean[][] board, int row){
        if (row == board.length) {
             printBoard(board);
            System.out.println();
            return;
        }
        for (int col = 0; col < board.length; col++) {
            //  Check if safe and place the queen
            if (isSafe(board, row, col)){
                board[row][col]  = true;
                placeQueens(board, row + 1);
                board[row][col] = false;
            }
        }
    }
    static boolean isSafe(boolean[][] board, int row, int col){
        // Check straight Up
        for (int i = 0; i < row; i++) {
            if (board[i][col]) return false;
        }
        // Check diagonal up left
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++){
            if(board[row-i][col-i]) return false;
        }
        // Check Diagonal up right
        int maxRight = Math.min(row, board.length-col-1);
        for (int i = 1; i <= maxRight; i++){
            if (board[row-i][col+i]) return false;
        }

        return true;
    }
    static void printBoard(boolean[][] board){
        for (boolean[] row : board){
            for (boolean element : row){
                if(element) System.out.print("Q ");
                else System.out.print("_ ");
            }
            System.out.println();
        }
    }
    static void queensSol(boolean[][] board, int row, List<List<String>> soloution){
        if(row == board.length){
            soloution.add(formatSol(board));
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)){
                board[row][col] = true;
                queensSol(board, row+1, soloution);
                board[row][col] = false;
            }
        }
    }
    static List<String> formatSol(boolean[][] board){
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            StringBuilder rowAns = new StringBuilder();
            for (int j = 0; j < board[i].length ; j++) {
                if(board[i][j]) rowAns.append("Q");
                else rowAns.append(".");
            }
            ans.add(rowAns.toString());
        }
        return ans;
    }
}
