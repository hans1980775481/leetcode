#!/usr/bin/python
# -*- coding: UTF-8 -*-
#!@Author:zhangwentao

# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None
from builtins import len


class Solution():
    def currentDeepCheck(self,nodesOfPreLine):
        nodesOfCurrentLine = []
        for node in nodesOfPreLine:
            if node.left != None : nodesOfCurrentLine.append(node.left)
            if node.right != None: nodesOfCurrentLine.append(node.right)
        if len(nodesOfCurrentLine) == 0:return 0
        else:
            return 1+self.currentDeepCheck(nodesOfCurrentLine)

    def maxDepth(self, root):

        if root == None : return 0

        nodesOfCurrentLine = [root]
        count = self.currentDeepCheck(nodesOfCurrentLine)
        return count




