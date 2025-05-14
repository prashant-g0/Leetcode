"""
Given a string S, the task is to print all the duplicate characters with their occurrences in the given string.

Example:
Input: S = “geeksforgeeks”
Output:
e, count = 4
g, count = 2
k, count = 2
s, count = 2

Explanation: g occurs 2 times in the string, k occurs 2 times in the string, 
s occurs 2 times in the string while e occurs 4 times in the string rest of the characters have unique occurrences.
"""

# from string using maps
def printDups(Str):

    count = {}
    for i in range(len(Str)):
        if(Str[i] in count):
            count[Str[i]] += 1
        else:
            count[Str[i]] = 1
        #increase the count of characters by 1 
 
    for it,it2 in count.items():  #iterating through the unordered map 
        if (it2 > 1):   #if the count of characters is greater than 1 then duplicate found
            print(str(it) + ", count = "+str(it2))
    
# Driver code
Str = "test string"
printDups(Str)
