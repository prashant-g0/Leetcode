"""
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
"""

def longestCommonPrefix(strs):
    # Return an empty string if the list is empty
    if not strs:
        return ""
    
    # Start with the first string as the initial prefix
    prefix = strs[0]
    
    # Loop through the rest of the strings in the list
    for string in strs[1:]:
        # While the current string doesn't start with the current prefix
        while string[:len(prefix)] != prefix:
            # Reduce the prefix by removing the last character
            prefix = prefix[:-1]
            
            # If the prefix becomes empty, return an empty string (no common prefix)
            if not prefix:
                return ""
    
    # Return the final longest common prefix
    return prefix

# Driver code
str = ["flower","flow","flight"]
print(longestCommonPrefix(str))
        