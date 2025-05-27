'''
-> Hackerrank: List
Link: https://www.hackerrank.com/challenges/python-lists/problem
Consider a list (list = []). You can perform the following commands:

insert i e: Insert integer e at position i.
print: Print the list.
remove e: Delete the first occurrence of integer e.
append e: Insert integer e at the end of the list.
sort: Sort the list.
pop: Pop the last element from the list.
reverse: Reverse the list.

Initialize your list and read in the value of  followed by  lines of commands where each command will be of the 7 types listed above. 
Iterate through each command in order and perform the corresponding operation on your list.

Sample Input: 
12
insert 0 5
insert 1 10
insert 0 6
print
remove 6
append 9
append 1
sort
print
pop
reverse
print

Sample Output:
[6, 5, 10]
[1, 5, 9, 10]
[9, 5, 1]
'''

#Code:

if __name__ == '__main__':
    N = int(input())
    List = []
    
    for i in range(N):
        command = input().split()
        if command[0] == "insert":
            List.insert(int(command[1]),int(command[2]))
        elif command[0] == "append":
            List.append(int(command[1]))
        elif command[0] == "pop":
            List.pop()
        elif command[0] == "print":
            print(List)
        elif command[0] == "remove":
            List.remove(int(command[1]))
        elif command[0] == "sort":
            List.sort()
        else:
            List.reverse()