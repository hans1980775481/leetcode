#!/usr/bin/python
# -*- coding: UTF-8 -*-
#!@Author:zhangwentao

class Solution(object):
    def nextGreatestLetter(self, letters, target):
        """
        :type letters: List[str]
        :type target: str
        :rtype: str
        """
        lettersOfSet = set(letters)
        result = None
        for letter in lettersOfSet :
            if result != None and target < letter and result > letter:
                result = letter
            elif result == None and target < letter :
                result = letter
        if result == None : result = letters[0]
        return result