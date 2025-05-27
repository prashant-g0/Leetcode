# -> Hackerrank: Hex Color Code 
# Link: https://www.hackerrank.com/challenges/hex-color-code/problem

# Sample Input
# 11
# #BED
# {
#     color: #FfFdF8; background-color:#aef;
#     font-size: 123px;
#     background: -webkit-linear-gradient(top, #f9f9f9, #fff);
# }
# #Cab
# {
#     background-color: #ABC;
#     border: 2px dashed #fff;
# }   

# Sample Output
# #FfFdF8
# #aef
# #f9f9f9
# #fff
# #ABC
# #fff

# Explanation
# #BED and #Cab satisfy the Hex Color Code criteria, but they are used as selectors and not as color codes in the given CSS.

# Hence, the valid color codes are:
# #FfFdF8
# #aef
# #f9f9f9
# #fff
# #ABC
# #fff

# Note: There are no comments ( // or /* */) in CSS Code.

#Code:

import re
n=int(input())
string=""
for i in range(n):
    st=input()
    string=string+"\n"+st
l=re.findall(":?.(#[a-fA-F0-9]{6}|#[a-fA-F0-9]{3})",string)
for i in range(len(l)):
    st=str(l[i])
    print(st[st.index('#'):])