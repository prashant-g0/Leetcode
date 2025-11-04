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

    public static void nQueensplacing(char[][] board, int row){
        int totCol = board.length;
        if(row == totCol){
            System.err.println("======Board======");
            printBoard(board);
            return;
        }

        for(int j=0; j<totCol; j++){
            board[row][j] = 'Q';
            nQueensplacing(board, row+1); // recursion
            board[row][j] = '.'; // backtracking
        }
    }

    public static void printBoard(char[][] board){
        int n = board.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(board[i][j] + " ");
            }
            System.err.println();
        }
    }

    public static void main(String[] args) {
        int n = 2;
        char[][] board = new char[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }

        nQueensplacing(board, 0);
        //printBoard(board);
    }
}
