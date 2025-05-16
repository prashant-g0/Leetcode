'''
Leetcode -> 71: Simplify Path
You are given an absolute path for a Unix-style file system, which always begins with a slash '/'. Your task is to transform this absolute path into its simplified canonical path.

Eg. 

Example 1:
Input: path = "/home/"
Output: "/home"

Explanation:
The trailing slash should be removed.

Example 2:
Input: path = "/home//foo/"
Output: "/home/foo"

Explanation:
Multiple consecutive slashes are replaced by a single one.

Example 3:
Input: path = "/home/user/Documents/../Pictures"
Output: "/home/user/Pictures"

Explanation:
A double period ".." refers to the directory up a level (the parent directory).

Example 4:
Input: path = "/../"
Output: "/"

Explanation:
Going one level up from the root directory is not possible.

Example 5:
Input: path = "/.../a/../b/c/../d/./"
Output: "/.../b/d"

Explanation:
"..." is a valid name for a directory in this problem.

'''

#Code

class Solution:
    def simplifyPath(self, path: str)-> str:
        values = path.split('/')
        dir = []

        for val in values:
            if val == "..":
                if dir:
                    dir.pop()
            elif val and val != ".":
                dir.append(val)
        
        ans = ""
        if not dir:
            ans += '/'
        else:
            ans += '/' + "/".join(dir)
        
        return ans    

# Driver code
str = "/home/"
s = Solution()
res = s.simplifyPath(str)
print(res)

# Time Complexity: O(length of string).