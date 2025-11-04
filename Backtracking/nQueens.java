// Problem: 
// The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.
// Given an integer n, return all distinct solutions to the n-queens puzzle. You may return the answer in any order.
// Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space, respectively.

// Example:
// Input: n = 4 
// Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]

// Input: n = 1
// Output: [["Q"]]

import java.util.Scanner;
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

    public static boolean oneWay(char[][] board, int row){
        int totCol = board.length;
        if(row == totCol){
            return true;
        }

        for(int j=0; j<totCol; j++){
            if(isSafe(board, row, j)){ // place queen only when safe to place
                board[row][j] = 'Q';
                if(oneWay(board, row+1)){ // recursion
                    return true;
                } 
                board[row][j] = '.'; // backtracking
            }
        }

        return false;
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

    public static void initializeBoard(char[][] board){
        int n = board.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }
    }

    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter board size (n): ");
        int n = sc.nextInt();

        while (true) {
            System.out.println("Enter \n1. Print all solutions (if exists). \n2. Print only one solution (if exists). \n3. Print total number of solutions. \n4. Exit.");
            int choice = sc.nextInt();
            count = 0;

            switch (choice) {
                case 1:
                    char[][] board1 = new char[n][n];
                    initializeBoard(board1);
                    placeQueens(board1, 0);
                    break;

                case 2:
                    char[][] board2 = new char[n][n];
                    initializeBoard(board2);
                    if (oneWay(board2, 0)) {
                        printBoard(board2);
                    } else {
                        System.out.println("No solution exists.");
                    }
                    break;

                case 3:
                    char[][] board3 = new char[n][n];
                    initializeBoard(board3);
                    placeQueens(board3, 0);
                    System.out.println("Total Solutions: " + count);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid! Try again");
            }
        }
    }
}

// Time Complexity: O(n!)