# Count distinct elements in every window
# Given an integer array arr[] and a number k. Find the count of distinct elements in every window of size k in the array.

class countDistinctEle:
    # Brute Force O(n*k)
    def countDistinctNoob(self, arr, k):
        res = []
        st, end = 0, k
        
        while end <= len(arr):
            currVals = set(arr[st:end])
            res.append(len(currVals))
            st, end = st+1, end+1
        
        return res
    
    # Optimized O(n)
    def countDistinctPro(self, arr, k):
        from collections import defaultdict
        res = []
        freq = defaultdict(int)
        
        for i in range(k):
            freq[arr[i]] += 1
        res.append(len(freq))
        
        for i in range(k, len(arr)):
            freq[arr[i-k]] -= 1
            if freq[arr[i-k]] == 0: del freq[arr[i-k]]
            
            freq[arr[i]] += 1
            res.append(len(freq))
        
        return res

sol = countDistinctEle()
arr = [1,2,3,4,5,4,2,5]
k = 4
print(sol.countDistinctNoob(arr, k))
print(sol.countDistinctPro(arr, k))
            
        
        
