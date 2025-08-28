// Given an m x n matrix, return all elements of the matrix in spiral order.

// Example 1:
// Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [1,2,3,6,9,8,7,4,5]

// Code:
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> SpiralList = new ArrayList<>();
        int stRow=0, stCol=0, endRow=n-1, endCol=m-1;
        
        while(stRow<=endRow && stCol<=endCol){
            //top border
            for(int j=stCol; j<=endCol; j++){
                SpiralList.add(matrix[stRow][j]);
            }
            //right
            for(int i=stRow+1; i<=endRow; i++){
                SpiralList.add(matrix[i][endCol]);
            }
            //bottom
            for(int j=endCol-1; j>=stCol; j--){
                if(stRow==endRow) break;
                SpiralList.add(matrix[endRow][j]);
            }
            //left
            for(int i=endRow-1; i>=stRow+1; i--){
                if(stCol==endCol) break;
                SpiralList.add(matrix[i][stCol]);
            }
            stCol++;
            stRow++;
            endCol--;
            endRow--;
        }
        return SpiralList;
    }
}
