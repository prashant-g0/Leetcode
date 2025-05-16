'''
GFG -> Smallest window containing all characters of another string

Given two strings s1 and s2. Find the smallest window in the string s1 consisting of all the characters(including duplicates) of the string s2. 
Return "" in case no such window is present. If there are multiple such windows of the same length, return the one with the least starting index.
Note: All characters are in lowercase letters. 

Example 1:
Input: s1 = "timetopractice", s2 = "toc"
Output: "toprac"
Explanation: "toprac" is the smallest substring in which "toc" can be found.

Example 2:
Input: s1 = "zoomlazapzo", s2 = "oza"
Output: "apzo"
Explanation: "apzo" is the smallest substring in which "oza" can be found.

Example 3:
Input: s1 = "zoom", s2 = "zooe"
Output: ""
Explanation: No window is present containing all characters of s2.
'''

#Code
class Solution:
    def smallest_window(self, s, p):
        len1 = len(s)
        len2 = len(p)

        if len1 < len2:
            return "ERROR: s1 is smaller than s2"

        countP = [0] * 256
        countS = [0] * 256

        # Store occurrence of characters of P
        for char in p:
            countP[ord(char)] += 1

        start = 0
        start_idx = -1
        min_len = float('inf')
        count = 0

        for j in range(len1):
            
            # Count occurrence of characters of string S
            countS[ord(s[j])] += 1

            # If S's char matches with P's char, increment count
            if countP[ord(s[j])] != 0 and countS[ord(s[j])] <= countP[ord(s[j])]:
                count += 1

            # If all characters are matched
            if count == len2:
                
                # Try to minimize the window
                while countS[ord(s[start])] > countP[ord(s[start])] or countP[ord(s[start])] == 0:
                    if countS[ord(s[start])] > countP[ord(s[start])]:
                        countS[ord(s[start])] -= 1
                    start += 1

                # Update window size
                length = j - start + 1
                if min_len > length:
                    min_len = length
                    start_idx = start

        if start_idx == -1:
            return "No Substring Found"

        return s[start_idx:start_idx + min_len]


s = Solution()
str1 = "prashant"
str2 = "rsa"
print(s.smallest_window(str1, str2))