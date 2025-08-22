# Question:
# Given an array arr[] of size n, containing elements from the range 1 to n, and each element appears at most twice, return an array of all the integers that appears twice.
# Note: You can return the elements in any order but the driver code will print them in sorted order.

# Code:
class Solution:
    def findDuplicates(self, arr):
        seen = set()
        result = set()
        for val in arr:
            if val in seen:
                result.add(val)
            else: seen.add(val)
        return list(result)
        
