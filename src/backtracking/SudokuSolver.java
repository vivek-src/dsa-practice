package backtracking;

public class SudokuSolver {
    static void main() {
        int[][] board = {
                { 8, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 3, 6, 0, 0, 0, 0, 0 },
                { 0, 7, 0, 0, 9, 0, 2, 0, 0 },
                { 0, 5, 0, 0, 0, 7, 0, 0, 0 },
                { 0, 0, 0, 0, 4, 5, 7, 0, 0 },
                { 0, 0, 0, 1, 0, 0, 0, 3, 0 },
                { 0, 0, 1, 0, 0, 0, 0, 6, 8 },
                { 0, 0, 8, 5, 0, 0, 0, 1, 0 },
                { 0, 9, 0, 0, 0, 0, 4, 0, 0 }
        };
        if(SolveSudoku(board)){
            DisplayBoard(board);
        }else {
            System.out.println("Can't be solved");
        }

    }
    static boolean SolveSudoku(int[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean foundEmpty = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0){
                    row = i;
                    col = j;
                    foundEmpty = true;
                    break;
                }
            }
            // if there are empty element in row, break
            if (foundEmpty){
                break;
            }
        }
        if (!foundEmpty){
            // board is solved
            return true;
        }
        //backtrack
        for (int num = 1; num <=9 ; num++) {
            if (isSafe(board, row, col, num)){
                board[row][col] = num;
                if (SolveSudoku(board)){
                    // Found the answer
                    return true;
                }else {
                    // Backtrack
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }
    static boolean isSafe(int[][] board, int row, int col, int num){
        //CHeck horizontal and vertical
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == num){
                return false;
            }
            if (board[i][col] == num){
                return false;
            }
        }
        // Check Minor 3x3 grid
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3 ; j++) {
                if (board[i][j] == num){
                    return false;
                }
            }
        }
        return true;
    }
    static void DisplayBoard(int[][] board){
        for(int[] row : board){
            for (int col : row){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
