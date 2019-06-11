#
# @lc app=leetcode id=101 lang=python
#
# [101] Symmetric Tree
#
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def isSymmetric(self, root):
        """
        :type root: TreeNode
        :rtype: bool
        """
        if not root or (not root.left and not root.right):
            return True
        if root.left and root.right and root.right.val==root.left.val:
            return self.check(root.left,root.right)
        else:
            return False
    def check(self,leftroot,rightroot):
        if not leftroot and not rightroot:
            return True
        elif leftroot and rightroot and leftroot.val==rightroot.val:
            return self.check(leftroot.left,rightroot.right) and self.check(leftroot.right,rightroot.left)
        else:
            return False
