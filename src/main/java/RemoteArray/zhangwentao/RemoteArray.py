#!/usr/bin/python
# -*- coding: UTF-8 -*-
#!@Author:zhangwentao

class Solution(object):
    def rotate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        if k <= 0:
            return nums
        else:
            for i in range(k):
                tmp = nums.pop();
                nums.insert(0, tmp)
