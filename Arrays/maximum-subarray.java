// Given an integer array nums, find the subarray with the largest sum, and return its sum.

// Example 1:
// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: The subarray [4,-1,2,1] has the largest sum 6.

// Code:

class Solution {
    public int maxSubArray(int[] arr) {
        int totalSum = 0, maxSum = Integer.MIN_VALUE; 
        for(int i=0; i<arr.length; i++){
            totalSum += arr[i];
            if(totalSum > maxSum){
                maxSum = totalSum;
            }
            if(totalSum<0){
                totalSum = 0;
            }
        }
        return maxSum;
    }
}
