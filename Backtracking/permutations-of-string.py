# Given a string s, which may contain duplicate characters, 
# your task is to generate and return an array of all unique permutations of the string. 
# You can return your answer in any order.

# Input: s = "ABC"
# Output: ["ABC", "ACB", "BAC", "BCA", "CAB", "CBA"]

# Code:

class Solution:
    def findPermutation(self, s):
        res = []
        
        def nextPermutation(s, ans):
            if len(s)==0:
                res.append(ans)
                return
            
            for i in range(len(s)):
                curr = s[i]
                new_s = s[:i] + s[i+1:]
                nextPermutation(new_s, ans+curr)
        
        nextPermutation(s, "")
        return list(set(res))
                
        
# Time Complexity : O(n*n!)
# Space Complexity: O(n!)

# Using list(set(res)) is not efficient and wastes memory and time. We can use flag like visited to optimize it.
