// Problem Statement:
// Given two variables L and R, indicating a range of integers from L to R inclusive, 
// and a number K, the task is to find Kth largest odd number. 
// If K > number of odd numbers in the range L to R then return 0.

// Example:
// Input: L = -10, R = 10, K = 8
// Output: -5
// Explanation: The odd Numbers in the range are -9, -7, -5, -3, -1, 1, 3, 5, 7, 9 and the 8th Largest odd number is -5

// Input: L = -3, R = 3, K = 1
// Output: 3

public class LargestOdd {
    public static int countOdd(int l, int r, int k){
        if (k<=0) return 0;

        int largest_odd = (r%2==0) ? r-1:r;
        int smallest_odd = (l%2==0) ? l+1:l;

        int count = ((largest_odd - smallest_odd)/2)+1;
        if(k>count) return 0;

        return largest_odd - 2*(k-1);
    }
    public static void main(String[] args) {
        int L = -10, R = 10, k = 8;

        int res = countOdd(L, R, k);
        if(res==0){
            System.out.println("No "+k+"th odd number in range!");
        } else{{
            System.out.println(k+"th odd is: "+res);
        }}
    }
}
