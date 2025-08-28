import java.util.*;

class MinMaxMatrix {
    public static void inputMatrix(int matrix[][]){
        Scanner ip = new Scanner(System.in);
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j] = ip.nextInt();
            }
        }
        ip.close();
    }
    public static void MinMax(int matrix[][]){
        int max = matrix[0][0], min = matrix[0][0];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(min > matrix[i][j]) min = matrix[i][j];
                if(max < matrix[i][j]) max = matrix[i][j];
            }
        }
        System.out.println("min is "+min+" max is "+max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter no. of cols: ");
        int cols = sc.nextInt();
        
        int matrix[][] = new int[rows][cols];
        
        inputMatrix(matrix);
        MinMax(matrix);
        
        sc.close();
    }
}

