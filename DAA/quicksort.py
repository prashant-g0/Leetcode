def quicksort(arr):
    if len(arr) <= 1: return arr
    
    pivot = arr[0]
    
    left = [x for x in arr[1:] if x < pivot]
    middle = [pivot]
    right = [x for x in arr[1:] if x >= pivot]
    
    return quicksort(left) + middle + quicksort(right)

if __name__ == "__main__":
    arr = [4, 5, 6, 2, 1, 1, 0, -1, -35, 45]
    print(f"Elements: {arr}")
    print(f"Sorted: {quicksort(arr)}")