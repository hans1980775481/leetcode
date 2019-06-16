#!/usr/bin/python
# -*- coding: UTF-8 -*-
#!@Author:zhangwentao
from builtins import len, range


def generateParenthesis(n):
    #validate n > 0 ? go on : return empty list
    line = n
    results = []
    if n == 0 :
        return []
    #use di gui fangfa
    else:
        tmp = 1
        string = ""
        while tmp <= n:
            string+="("
            tmp+=1
        results.append(string.ljust(2*n,')'))
        while line >= 2:
            ListMaker(results,line,n,None,None)
            line -= 1
        return results


"""
digui
"""
def ListMaker(results,line,n,string,minIndexOfPreLine):

    maxIndex = 2*line - 2
    minIndex = minIndexOfPreLine+1 if minIndexOfPreLine != None else line

    while minIndex <= maxIndex:
        resultOfPre = string if string != None else results[len(results)-1]
        new = ""
        for pos in range(len(resultOfPre)):
            if pos == minIndex:
                new += '('
            elif pos == minIndex - 1 and pos != minIndexOfPreLine:
                new += ')'
            elif pos > minIndex:
                new += ')'
            else:
                new += resultOfPre[pos]

        if line != n : ListMaker(results, line+1, n,new,minIndex)
        if line == n : results.append(new)
        minIndex += 1
    return

n = 3
results = generateParenthesis(n)
for result in results:
    print (result)