# Subarrays With At Most K Distinct Integers

# You are given an array arr[] of positive integers and an integer k, 
# find the number of subarrays in arr[] where the count of distinct 
# integers is at most k.

# Note: A subarray is a contiguous part of an array.

class Solution:
# brute force O(n^3)
    def recurse(self, arr, st, end, k, cnt):
        if end == len(arr): 
            return cnt
        
        elif st>end: 
            return self.recurse(arr, 0, end+1, k, cnt)
            
        else: 
            if len(set(arr[st:end + 1])) <= k: cnt+=1
            return self.recurse(arr, st+1, end, k, cnt)
        
    def countAtMostKNoob(self, arr, k):
        return self.recurse(arr, 0, 0, k, 0)

# optimized O(n)
    def countAtMostKPro(self, arr, k):
        from collections import defaultdict
        freq = defaultdict(int)
        left = count = distinct = 0
        
        for right in range(len(arr)):
            if freq[arr[right]] == 0:
                distinct += 1
            freq[arr[right]] += 1
            
            while distinct > k:
                freq[arr[left]] -= 1
                if freq[arr[left]] == 0:
                    distinct -= 1
                left += 1
            
            count += (right - left + 1)
        
        return count