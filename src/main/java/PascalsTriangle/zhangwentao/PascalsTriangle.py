#!/usr/bin/python
# -*- coding: UTF-8 -*-
#!@Author:zhangwentao

class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        lists = []
        if numRows >= 1:
            lists.append([1]);
        if numRows >= 2:
            lists.append([1,1])
        if numRows > 2:
            for i in range(numRows - 2):
                list = [1]
                for j in range(len(lists[i+1])-1):
                    list.append(lists[i+1][j]+lists[i+1][j+1])
                list.append(1)
                lists.append(list)
        return lists
