// Given an array arr[] and a number k, 
// split the given array into k subarrays such that 
// the maximum subarray sum achievable out of k subarrays formed is 
// the minimum possible, find that possible subarray sum.

// Examples:
// Input: arr[] = [1, 2, 3, 4], k = 3 
// Output: 4 
// Explanation: Optimal Split is [1, 2], [3], [4]. Maximum sum of all subarrays is 4, which is minimum possible for 3 splits.

// Input: arr[] = [1, 1, 2], k = 2 
// Output: 2 
// Explanation: Splitting the array as [1, 1] and [2] is optimal. This results is a maximum sum subarray of 2.

import java.util.*;

public class SplitArray {

    public static int possibleSplits(int[] arr, int k, int mid){
        int sum = 0, count = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(sum > mid){
                count++;
                sum = arr[i];
            }
        }
        return count;
    }

    public static int split(int[] arr, int k){
        int st = Arrays.stream(arr).max().getAsInt();
        int end = Arrays.stream(arr).sum();
        int res = 0;

        while(st<=end){
            int mid = st + (end-st)/2;
            int n = possibleSplits(arr, k, mid);

            if(n <= k){
                res = mid;
                end = mid -1;
            } else {
                st = mid + 1;
            }
        }

        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int k = 2;
        System.out.println("Minimum possible maximum sum: " + split(arr, k));
    }
}
