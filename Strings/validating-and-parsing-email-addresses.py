# -> Hackerrank: Validating and Parsing Email Addresses
# Link: https://www.hackerrank.com/challenges/validating-named-email-addresses/problem

# Sample Input:
# 2  
# DEXTER <dexter@hotmail.com>
# VIRUS <virus!@variable.:p>

# Sample Output:
# DEXTER <dexter@hotmail.com>

# Explanation
# dexter@hotmail.com is a valid email address, so we print the name and email address pair received as input on a new line.
# virus!@variable.:p is not a valid email address because the username contains an exclamation point (!) and the extension contains a colon (:). 
# As this email is not valid, we print nothing.


#Code:

import re 
import email.utils

N = int(input())

pattern = r'^[a-z][\w\-\.]+@[a-z]+\.[a-z]{1,3}$'

for i in range(N):
    parsedAdd = email.utils.parseaddr(input())
    if re.search(pattern, parsedAdd[1]):
        print(email.utils.formataddr(parsedAdd))