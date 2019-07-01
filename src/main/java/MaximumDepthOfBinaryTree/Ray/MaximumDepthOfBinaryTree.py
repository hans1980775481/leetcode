# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def maxDepth(self, root: TreeNode) -> int:
        return 0 if not root else max(self.maxDepth(root.left)+1,self.maxDepth(root.right)+1)


#Runtime: 52 ms, faster than 36.86% of Python3 online submissions for Maximum Depth of Binary Tree.
#Memory Usage: 15.3 MB, less than 73.94% of Python3 online submissions for Maximum Depth of Binary Tree.
