// Problem: 
// The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.
// Given an integer n, return all distinct solutions to the n-queens puzzle. You may return the answer in any order.
// Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space, respectively.

// Example:
// Input: n = 4 
// Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]

// Input: n = 1
// Output: [["Q"]]


class nQueens {

    public static boolean isSafe(char[][] board, int row, int col){
        // vertically up
        for(int i=row-1; i>=0; i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        // diagonal up left
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        // diagonal up right
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    public static void placeQueens(char[][] board, int row){
        int totCol = board.length;
        if(row == totCol){
            count++;
            printBoard(board);
            return;
        }

        for(int j=0; j<totCol; j++){
            if(isSafe(board, row, j)){ // place queen only when safe to place
                board[row][j] = 'Q';
                placeQueens(board, row+1); // recursion
                board[row][j] = '.'; // backtracking
            }
        }
    }

    public static void printBoard(char[][] board){
        System.err.println("======Board======");
        int n = board.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int count = 0;
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }

        placeQueens(board, 0);
        System.out.println("Total Solutions: " + count);
        //printBoard(board);
    }
}
