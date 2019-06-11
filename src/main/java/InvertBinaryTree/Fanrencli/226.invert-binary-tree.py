#
# @lc app=leetcode id=226 lang=python
#
# [226] Invert Binary Tree
#
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def invertTree(self, root):
        """
        :type root: TreeNode
        :rtype: TreeNode
        """
        if not root:
            return None
        root.left,root.right=root.right,root.left
        if root.left and root.right:
            self.invertTree(root.left)
            self.invertTree(root.right)
        elif root.left:
            self.invertTree(root.left)
        elif root.right:
            self.invertTree(root.right)
        return root
