#!/usr/bin/python
# -*- coding: UTF-8 -*-
#!@Author:zhangwentao
import sys
class Solution(object):

    def getMoneyAmount(self, n):
        dp = [ [0] * (n+1) for i in range(n+1)]
        for h in range(n,0,-1):
            for e in range(h,n+1,1):
                if h == e:
                    dp[h][e] = 0
                    continue
                dp[h][e] = sys.maxsize
                temp = 0
                for pos in range(h,e+1,1):
                    left = 0 if pos-1 <= h else dp[h][pos-1]
                    right = 0 if pos+1 >=e else dp[pos+1][e]
                    temp = pos+left if left > right else pos+right
                    dp[h][e] = temp if temp < dp[h][e] else dp[h][e]
        print(dp[1][n])

Solution().getMoneyAmount(9)