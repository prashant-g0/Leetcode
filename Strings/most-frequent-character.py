# Code
def getMaxOccurringChar(s):
    freq = {}
    # Step 1: Frequency map
    for ch in s:
        if ch not in freq:
            freq[ch] = 1
        else: freq[ch] += 1
    
    # Step 2: Sort the map lexicographically
    freq = dict(sorted(freq.items()))
    maxi = 1
    
    # Step 3: Find the element with maximum frequency
    for key, value in freq.items():
        if maxi < value:
            maxi = value
            res = key
    
    # Step 4: Return the result
    return res

print(getMaxOccurringChar("output"))
