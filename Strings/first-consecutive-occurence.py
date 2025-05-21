'''
HackerRank: https://www.hackerrank.com/challenges/re-group-groups/

Find the first occurrence of an alphanumeric character in S (read from left to right) that has consecutive repetitions.

Example:
Input: ..12345678910111213141516171820212223
Output: 1
Explanation: .. is the first repeating character, but it is not alphanumeric.
1 is the first (from left to right) alphanumeric repeating character of the string in the substring 111.
'''

#Code

s = input()
found = False
for i in range(1, len(s)):
    if s[i].isalnum() and s[i] == s[i - 1]:
        print(s[i])
        found = True
        break
if not found:
    print(-1)
