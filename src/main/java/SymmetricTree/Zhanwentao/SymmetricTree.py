#!/usr/bin/python
# -*- coding: UTF-8 -*-
#!@Author:zhangwentao
from builtins import len, list, range, object


class TreeNode(object):
    def __init__(self, x,left,right):
        self.val = x
        self.left = left
        self.right = right

def solution(root) :
    if root is None or (root.left is None and root.right is None) :
        return True
    nodes = [root.left,root.right]
    while len(nodes) != 0:
      for i in range(len(nodes)/2):
          left = None if nodes[i] is None else nodes[i].val
          right = None if nodes[len(nodes) - i - 1] is None else nodes[len(nodes) - i - 1].val
          if left != right :
              return False

      tmp = list(nodes)
      nodes.clear()
      flag = True
      for node in tmp:
          if node != None:
              if node.left != None or node.right != None: flag = True
              nodes.append(node.left)
              nodes.append(node.right)
      if flag == False :
          break
    return True















