# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
class Solution:
    def isSymmetric(self, root):
        stack=[root,root]
        while stack:
            nodeLeft=stack.pop()
            nodeRight=stack.pop()
            if not nodeLeft and not nodeRight:
                continue
            if not nodeLeft or not nodeRight:
                return False
            if nodeLeft.val==nodeRight.val:
                stack.append(nodeLeft.left)
                stack.append(nodeRight.right)
                stack.append(nodeLeft.right)
                stack.append(nodeRight.left)
            else:
                return False
        return True

#Your runtime beats 75.51 % of python3 submissions.
#Your memory usage beats 93.82 % of python3 submissions.
