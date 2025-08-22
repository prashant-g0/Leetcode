# Question: 
# Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.

# Code:
class Solution:
    def getSecondLargest(self, arr):
        arr = list(set(arr))
        if len(arr) <=1: return -1
        super = max(arr)
        maxi=min(arr)
        
        for val in arr:
            if(val>maxi and val<super):
                maxi = val
        return maxi
        
