// Given an array of integers nums, calculate the pivot index of this array.
// The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
// If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
// Return the leftmost pivot index. If no such index exists, return -1.

// Code:
import java.util.Arrays;
class Solution {
    public int pivotIndex(int[] arr) {
        int n = arr.length;
        int prefix = 0, suffix;
        int total = Arrays.stream(arr).sum();
        
        for(int i=0; i<n; i++){
            suffix = total-prefix-arr[i];
            if (suffix == prefix){
                return i;
            }
            prefix += arr[i];
        }
        return -1;
    }
}
