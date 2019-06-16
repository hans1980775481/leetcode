#!/usr/bin/python
# -*- coding: UTF-8 -*-
#!@Author:zhangwentao


"""
left -> right
right -> left
"""
class Solution():
    def invertTree(self, root):
        if root == None: return root
        temp = root.left
        root.left = root.right
        root.right = temp
        self.invertTree(root.left)
        self.invertTree(root.right)
        return root

