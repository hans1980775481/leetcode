# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def invertTree(self, root: TreeNode) -> TreeNode:
        if not root:
            return root
        left_tr = root.left
        right_tr = root.right
        root.left = self.invertTree(right_tr)
        root.right = self.invertTree(left_tr)
        
        return root