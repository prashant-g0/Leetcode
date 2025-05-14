"""
Leetcode -> 680 : Valid Palindrome
Given a string s, return true if the s can be palindrome after deleting at most one character from it.

Eg. 
Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.
"""

#Code
class Solution:
    def validPalindrome(self, s: str) -> bool:
        l,r = 0, len(s)-1
        while l<r:
            if s[l]!=s[r]:
                skipL, skipR = s[l+1: r+1], s[l:r]
                return (skipL == skipL[::-1] or skipR == skipR[::-1])
            l, r = l+1, r-1
        return True
    
#Driver code
s = Solution()
str = "poap"
print(f"String is {str}\nPalindrome Value: {s.validPalindrome(str)}")