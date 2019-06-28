#!/usr/bin/python
# -*- coding: UTF-8 -*-
#!@Author:zhangwentao
# The isBadVersion API is already defined for you.
# @param version, an integer
# @return a bool
# def isBadVersion(version):

class Solution(object):
    def firstBadVersion(self, n):
        return self.firstBadVersionBy2Fen(1,n)
    def firstBadVersionBy2Fen(self,head,end):
        if head == end:
            return head
        zj = (head + end) / 2
        pre = True if (zj+1)==end else isBadVersion(zj+1)
        cur = isBadVersion(zj)
        if pre == True and cur == False:
            return zj+1
        elif cur == False:
            return self.firstBadVersionBy2Fen(zj,end)
        elif cur == True:
            return self.firstBadVersionBy2Fen(head,zj);
