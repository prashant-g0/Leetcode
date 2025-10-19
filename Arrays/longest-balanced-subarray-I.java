// You are given an integer array nums. 
// A subarray is called balanced if the number of distinct even nubers in the subaaray is equal to the number of distinct odd numbers.
// Return the length of the longest balanced subarray.

// Example
// Input: nums = [2,5,4,3]
// Output = 4

// Input: nums = [3,2,2,5,4]
// Output = 5

// Input: nums = [1,2,3,2]
// Output = 3

// Code:

import java.util.HashSet;
class Solution {
    public int longestBalanced(int[] nums) {
        int n = nums.length;
        int max_len = 0;

        for(int i=0; i<n; i++){
            HashSet<Integer> even = new HashSet<>();
            HashSet<Integer> odd = new HashSet<>();

            for(int j=i; j<n; j++){
                if(nums[j]%2==0){
                    even.add(nums[j]);
                } else{
                    odd.add(nums[j]);
                }

                if(even.size() == odd.size()){
                    max_len = Math.max(max_len, j-i+1);
                }
            }
        }
        return max_len;            
    }
}
