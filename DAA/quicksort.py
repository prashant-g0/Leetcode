# Easiest method
def quicksort(arr):
    if len(arr) <= 1: return arr
    
    pivot = arr[0]
    
    left = [x for x in arr[1:] if x < pivot]
    middle = [pivot]
    right = [x for x in arr[1:] if x >= pivot]
    
    return quicksort(left) + middle + quicksort(right)

# ma'am's method
def partition(arr, l, r, pivot):
    while l <= r:
        while arr[l] < pivot: l += 1
        while arr[r] > pivot: r -= 1
        
        if l <= r:
            arr[l],arr[r] = arr[r],arr[l]
            l += 1
            r -= 1
    return l

def quick_sort(arr, st, end):
    if st < end:
        pivot = arr[st+(end-st)//2]
        idx = partition(arr, st, end, pivot)
        quick_sort(arr, st, idx-1)
        quick_sort(arr, idx, end)

if __name__ == "__main__":
    arr = list(map(int, input("Enter array values: ").split()))
    print(f"Elements: {arr}")
    print(f"Sorted (Easiest Method): {quicksort(arr)}")
    
    print(f"Elements: {arr}")
    quick_sort(arr, 0, len(arr)-1)
    print(f"Sorted (Ma'am's Method): {arr}")