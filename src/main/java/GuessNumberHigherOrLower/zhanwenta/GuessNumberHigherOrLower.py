#!/usr/bin/python
# -*- coding: UTF-8 -*-
#!@Author:zhangwentao

# The guess API is already defined for you.
# @param num, your guess
# @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
# def guess(num):

class Solution(object):
    def guessNumber(self, n):
        """
        :type n: int
        :rtype: int
        """
        return self.guessNumberExe(1,n)

    def guessNumberExe(self,head,end):
        if head == end : return head
        zj = (head + end) / 2
        result = guess(zj)
        if result == 1:
            return self.guessNumberExe(zj + 1,end)
        elif result == 0:
            return zj
        else:
            return self.guessNumberExe(head,zj-1)