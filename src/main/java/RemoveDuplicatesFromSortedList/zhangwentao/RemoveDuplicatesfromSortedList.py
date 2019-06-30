#!/usr/bin/python
# -*- coding: UTF-8 -*-
#!@Author:zhangwentao

# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def deleteDuplicates(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if head == None: return None

        root = ListNode(head.val)
        current = root
        head = head.next

        while head != None:
            if head.val == current.val:
                head = head.next
                continue
            else:
                current.next = ListNode(head.val)
                current = current.next
        return root