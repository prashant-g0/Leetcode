# You are given an array of positive integers arr[]. Your task is to find the count of special numbers in the array.
# A number is said to be a special number if it is divisible by at least one other element of the array.

# Example 1
# Input: arr[] = [1, 2, 3]
# Output: 2
# Explanation:
# 2 is divisible by 1
# 3 is divisible by 1
# → Total 2 special numbers

# Example 2
# Input: arr[] = [2, 3, 4, 6, 8, 9]
# Output: 4
# Explanation:
# 4 is divisible by 2
# 6 is divisible by 2
# 8 is divisible by 2
# 9 is divisible by 3
# → Total 4 special numbers

# Code:
def countSpecialNumbers(arr):
    n = len(arr)
    max_val = max(arr)

    # frequency of each number in arr
    freq = [0] * (max_val + 1)
    for num in arr:
        freq[num] += 1

    # mark multiples
    divisible = [0] * (max_val + 1)
    for i in range(1, max_val + 1):
        if freq[i] > 0:
            for j in range(i * 2, max_val + 1, i):
                divisible[j] = 1

    # count special numbers
    count = 0
    for num in arr:
        if freq[num] > 1:   # duplicates
            count += 1
        elif divisible[num]:
            count += 1

    return count
