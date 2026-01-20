// Problem:
// GIven two arrays A and B of equal length N. 
// Pair each element of array A to an element in array B, 
// such that sum S of absolute differences of all the pairs is minimum.

// Example:
// input: A = [1, 2, 3], B = [2, 1, 3]
// output: ans = 0
import java.util.*;
public class MinAbsoluteDiffPairs {
    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        int[] B = {2, 1, 3};

        Arrays.sort(A);
        Arrays.sort(B);
        int res = 0;
        for(int i=0; i<A.length; i++){
            res += Math.abs(A[i]-B[i]);
        }

        System.out.println("RES: " + res);
    }
}
