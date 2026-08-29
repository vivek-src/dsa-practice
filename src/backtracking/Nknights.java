package backtracking;

public class Nknights {
    static void main() {
        boolean[][] board = new boolean[4][4];
        placeKnight(board, 0, 0, 4);
    }
    static void  placeKnight(boolean[][] board, int row, int col, int knights){
        if (knights == 0){
            printBoard(board);
            System.out.println();
            return;
        }
        if(row == board.length-1 && col == board.length){
            return;
        }
        if(col == board.length){
            placeKnight(board, row+1, 0, knights);
            return;
        }
        if (checkSafe(row, col, board)){
            board[row][col] = true;
            placeKnight(board,row, col+1,knights-1 );
            board[row][col] = false;
        }
        placeKnight(board, row, col+1, knights);

    }
    static boolean checkSafe(int row, int col, boolean[][] board){
        if (isValid(board, row-2, col-1)) {
            if(board[row-2][col-1]){
                return false;
            }
        }
        if (isValid(board, row-2, col+1)) {
            if(board[row-2][col+1]){
                return false;
            }
        }
        if (isValid(board, row-1, col-2)) {
            if(board[row-1][col-2]){
                return false;
            }
        }
        if (isValid(board, row-1, col+2)) {
            if(board[row-1][col+2]){
                return false;
            }
        }
        return true;
    };
    static boolean isValid(boolean[][] board, int r, int c){
        return r >= 0 && r < board.length && c >= 0 && c < board.length;
    }
    static void printBoard(boolean[][] board){
        for (boolean[] row : board){
            for (boolean element : row){
                if(element) System.out.print("K ");
                else System.out.print("_ ");
            }
            System.out.println();
        }
    }
}
