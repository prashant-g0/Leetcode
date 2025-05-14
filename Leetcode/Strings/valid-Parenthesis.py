"""
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 
Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false

Example 4:
Input: s = "([])"
Output: true
"""

def isValid(s: str) -> bool:
    stack = []
    # Dictionary to match closing brackets with their corresponding opening brackets
    bracket_map = {')': '(', '}': '{', ']': '['}
    
    for char in s:
        if char in bracket_map:
            # Pop from the stack if there is a matching opening bracket
            top_element = stack.pop() if stack else '#'
            if bracket_map[char] != top_element:
                return False
        else:
            # If it's an opening bracket, push it to the stack
            stack.append(char)
    
    # If stack is empty, all brackets were matched
    return not stack

# Driver code
str = "{[()]}"
print(isValid(str))