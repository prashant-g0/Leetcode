class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        nextt = {}
        stack = []
        for val in reversed(nums2):
            while stack and stack[-1] <= val:
                stack.pop()
            nextt[val] = stack[-1] if stack else -1
            stack.append(val)
        
        return [nextt[num] for num in nums1]