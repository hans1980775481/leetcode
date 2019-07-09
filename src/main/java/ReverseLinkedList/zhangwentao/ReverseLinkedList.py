#!/usr/bin/python
# -*- coding: UTF-8 -*-
#!@Author:zhangwentao

# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        todo = None
        now = head
        pre = None;
        while now != None:
            todo = now.next;
            now.next = pre;
            pre = now;
            now = todo;
        return pre;
