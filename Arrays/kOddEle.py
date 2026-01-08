# You are given an array arr[] of positive integers and an integer k. 
# You have to count the number of subarrays that contain exactly k odd numbers.

class Solution:
    def countSubarrays(self, arr, k):
        cnt = odd = 0
        prefix = {0:1}
        
        for i in range(len(arr)):
            if arr[i] % 2 != 0: odd+=1
            if odd-k in prefix: cnt+=prefix[odd-k]
            prefix[odd] = prefix.get(odd, 0) + 1
        
        return cnt