# without recursion
def binary_search(arr, target):
    st, end = 0, len(arr)-1
    
    while st < end:
        mid = st + (end-st)//2
        
        if arr[mid] == target: return mid
        elif arr[mid] < target: st = mid + 1
        else: end = mid - 1
    
    return -1

# with recursion
def recur_binary_search(arr, target, st, end):
    if st >= end: return -1
    
    mid = st + (end-st)//2
    
    if arr[mid] == target: return mid
    elif arr[mid] < target: return recur_binary_search(arr, target, mid+1, end)
    else: return recur_binary_search(arr, target, st, mid-1)
    
    

if __name__ == "__main__":
    arr = list(map(int, input("Enter array values: ").split()))
    target = int(input("Enter target value: "))
    
    print("Without Recursion: ")
    idx = binary_search(arr, target)
    if idx != -1:
        print(f"Element found at index: {idx}")
    else:
        print("Element not found")
        
    print("With Recursion: ")
    idx = recur_binary_search(arr, target, 0, len(arr)-1)
    if idx != -1:
        print(f"Element found at index: {idx}")
    else:
        print("Element not found")