# Given the root of a binary tree, 
# split the binary tree into two subtrees by removing one edge 
# such that the product of the sums of the subtrees is maximized.

# Return the maximum product of the sums of the two subtrees. 
# Since the answer may be too large, return it modulo 109 + 7.

# Note that you need to maximize the answer before taking the mod and not after taking it.

# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
class Solution:
    def maxProduct(self, root: TreeNode) -> int:
        self.MAX = float('-inf')
        MOD = (10**9)+7

        total = self.treeSum(root)
        self.dfs(root, total)
        return self.MAX % MOD

    def treeSum(self, root):
        if root is None: return 0
        left = self.treeSum(root.left)
        right = self.treeSum(root.right)
        return left+right+root.val
    
    def dfs(self, root, total):
        if root is None: return 0
        left = self.dfs(root.left, total)
        right = self.dfs(root.right, total)

        currSum = left+right+root.val
        self.MAX = max(self.MAX, (total-currSum)*currSum)

        return currSum