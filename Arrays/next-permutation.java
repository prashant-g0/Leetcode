void nextPermutation(int[] nums){
    
    int n = nums.length, i = n - 2;
    while (i >= 0 && nums[i] >= nums[i + 1])
        i--;
    if (i >= 0) {
        int j = n - 1;
        while (nums[j] <= nums[i])
            j--;
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
    
    for (int l = i + 1, r = n - 1; l < r; l++, r--) {
        int tmp = nums[l];
        nums[l] = nums[r];
        nums[r] = tmp;
    }
}

// Eg: 
// Input: [1,2,3]
// Output: [1,3,2]
