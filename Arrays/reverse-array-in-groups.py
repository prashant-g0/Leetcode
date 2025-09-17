#Given an arr[] of positive integers, reverse every sub-group of size k. 
#If at any instance, k is greater or equal to the array size, the reverse the entire array.

# Code:

class Solution:
  def reverse(self, arr, k):
    i = 0
    n = len(arr)
    while i<n:
      l = i
      r = min(i+k-1, n-1)
      while l<r:
        arr[l], arr[r] = arr[r], arr[l]
        l+=1
        r-=1
      i+k
