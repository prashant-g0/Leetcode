'''
Leetcode -> 22: Generate Parentheses 
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

Eg.

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
'''

#Code

# Function to generate valid parentheses sequences
class Solution:
    def validParentheses(self, n, openCount, curr, res):
    
        # If the current sequence has reached
        # the length of 2 * n, add it to the result
        if len(curr) == 2 * n:
            res.append(curr)
            return

        # Add opening parenthesis if we haven't used all n opening parentheses
        if openCount < n:
            self.validParentheses(n, openCount + 1, curr + '(', res)

        # Add closing parenthesis if the number of
        # closing parentheses is less than the number of opening ones
        if len(curr) - openCount < openCount:
            self.validParentheses(n, openCount, curr + ')', res)

    # Function to return all valid parentheses sequences
    def generateParentheses(self, n):
        res = []
        
        # Start recursion with 0 open parentheses and an empty string
        self.validParentheses(n, 0, '', res)  
        return res

if __name__ == "__main__":
    s = Solution()
    n = 3 
    res = s.generateParentheses(n)
    print(res)