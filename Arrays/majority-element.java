// Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:
Input: nums = [3,2,3]
Output: 3

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2

// Code for Java:
class Solution {
    public int majorityElement(int[] nums) {
        int freq = 0, ans = 0;
        for(int i=0; i<nums.length; i++){
            if (freq==0) ans = nums[i];
            if (ans==nums[i]){
                freq += 1;
            } else{
                freq -= 1;
            }
        }
        return ans;
    }
}

// Code for Python:
from collections import Counter

class Solution:
    def majorityElement(self, arr):
        char_counts = Counter(arr)

        for key, value in char_counts.items():
            if value > len(arr)//2:
                return key
        
        return -1
