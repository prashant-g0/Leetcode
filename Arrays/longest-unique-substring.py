# Problem:  
# Write a function longest_unique_substring(s: str) -> int that returns the length of the longest substring without repeating characters.

def func(s: str) -> int:
    lastIndex = dict()
    
    left, res = 0, 0
    for right in range(len(s)):
        print(f"Current letter: {s[right]}")
        
        if s[right] in lastIndex:
            left = max(left, lastIndex[s[right]] + 1)
        print(f"Current values: ({left, right})")
            
        lastIndex[s[right]] = right
        print(f"Seen Table\n{lastIndex}")
        
        res = max(res, right-left+1)
        print(f"Max Window: {res}\n")
    
    return res
    
print(func("abba"))
    