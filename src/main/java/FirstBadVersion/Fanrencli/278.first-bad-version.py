#
# @lc app=leetcode id=278 lang=python
#
# [278] First Bad Version
#
# The isBadVersion API is already defined for you.
# @param version, an integer
# @return a bool
# def isBadVersion(version):

class Solution(object):
    def firstBadVersion(self, n):
        """
        :type n: int
        :rtype: int
        """
        return self.BinarySearch(1,n)
    def BinarySearch(self,start,end):
        if start>end:
            return None
        if isBadVersion(int((start+end)/2-0.1)+1):
            return int((start+end)/2-0.1)+1 if self.BinarySearch(start,int((start+end)/2-0.1))==None else self.BinarySearch(start,int((start+end)/2-0.1)) 
        else:
            return self.BinarySearch(int((start+end)/2-0.1)+2,end)
