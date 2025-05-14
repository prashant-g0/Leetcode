"""
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
"""

def twoSum(nums, target):
    # Dictionary to store numbers and their corresponding indices
    num_map = {}
    
    # Iterate through the list
    for i, num in enumerate(nums):
        compliment = target - num
        
        # If the complement exists in the map, return the pair of indices
        if compliment in num_map:
            return [num_map[compliment], i]
        
        # Otherwise, store the current number with its index
        num_map[num] = i
    
    # If no solution is found (though the problem guarantees one solution)
    return None

# Driver code
nums = [2,4,6,3,5,1]
target = 6
print(twoSum(nums, target))
