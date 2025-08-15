Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

Example 1:
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.

Example 2:
Input: height = [4,2,0,3,2,5]
Output: 9

// Code:

class Solution {
    public int trap(int[] height) {
        int l = 0, lmax = 0, r = height.length - 1, rmax = 0, water = 0;

        while(l <= r){
            if(height[l] < height[r]){
                if(height[l] >= lmax){
                    lmax = height[l];
                } else{
                    water += lmax - height[l];
                }
                l++;
            } else{
                if(height[r] >= rmax){
                    rmax = height[r];
                } else{
                    water += rmax - height[r];
                }
                r--;
            }
        }
        return water;
    }
}
