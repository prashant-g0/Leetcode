import java.util.*;
class Main {
    public static void inputMatrix(int matrix[][]){
        Scanner ip = new Scanner(System.in);
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j] = ip.nextInt();
            }
        }
        ip.close();
    }
    public static void SpiralMatrix(int matrix[][]){
        int n = matrix.length;
        int stRow=0, stCol=0, endRow=n-1, endCol=n-1;
        
        while(stRow<=endRow && stCol<=endCol){
            //top border
            for(int j=stCol; j<=endCol; j++){
                System.out.print(matrix[stRow][j]);
            }
            //right
            for(int i=stRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endCol]);
            }
            //bottom
            for(int j=endCol-1; j>=stCol; j--){
                System.out.print(matrix[endRow][j]);
            }
            //left
            for(int i=endRow-1; i>=stRow+1; i--){
                System.out.print(matrix[i][stCol]);
            }
            stCol++;
            stRow++;
            endCol--;
            endRow--;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter no. of cols: ");
        int cols = sc.nextInt();
        
        int matrix[][] = new int[rows][cols];
        
        inputMatrix(matrix);
        SpiralMatrix(matrix);
        
        sc.close();
    }
}
