#!/usr/bin/python
# -*- coding: UTF-8 -*-
#!@Author:zhangwentao

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def convertBST(self, root):
        """
        :type root: TreeNode
        :rtype: TreeNode
        """
        lists = self.convertBSTExe(root)
        for i in range(1, len(lists), 1):
            lists[i].val += lists[i - 1].val
        return root
    def convertBSTToList(self,root):
        list = []
        if root == None: return list
        listOfRight = self.convertBSTToList(root.right)
        listOfLeft = self.convertBSTToList(root.left)
        list.extend(listOfRight)
        list.append(root)
        list.extend(listOfLeft)
        return list

