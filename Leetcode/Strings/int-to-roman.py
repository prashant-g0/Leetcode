"""
Leetcode -> 12: Integer to Roman

Example: 
Input: num = 58
Output: "LVIII"

"""

#Code: 
class Solution:
    def intToRoman(self, num: int) -> str:
        #Possible key-value pair of combinations 
        symbol = [["I", 1], ["IV", 4], ["V", 5], ["IX", 9], ["X", 10], ["XL", 40], ["L", 50], ["XC", 90], ["C", 100], ["CD", 400], ["D", 500], ["CM", 900], ["M", 1000]]

        res = ""
        for sym, val in reversed(symbol):
            if num//val:
                count = num//val
                res += (sym*count)
                num %= val
        return res
    
#Driver Code
s = Solution()
num = 2490
print(f"Roman of {num} is {s.intToRoman(num)}")