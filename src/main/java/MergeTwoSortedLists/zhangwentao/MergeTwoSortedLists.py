#!/usr/bin/python
# -*- coding: UTF-8 -*-
#!@Author:zhangwentao

# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def mergeTwoLists(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        root = None
        current = None
        if l1 == None:
            root = l2
            return root
        elif l2 == None:
            root = l1
            return root
        elif l1.val < l2.val:
            current = ListNode(l1.val)
            root = current
            l1 = l1.next
        elif l1.val > l2.val:
            current = ListNode(l2.val)
            root = current
            l2 = l2.next
        else:
            current = ListNode(l1.val)
            root = current
            l1 = l1.next
            current.next = ListNode(l2.val)
            current = current.next
            l2 = l2.next
        while l1 != None or l2 != None:
            if l1 == None:
                current.next = ListNode(l2.val)
                current = current.next
                l2 = l2.next
            elif l2 == None:
                current.next = ListNode(l1.val)
                current = current.next
                l1 = l1.next
            elif l1.val < l2.val:
                current.next = ListNode(l1.val)
                current = current.next
                l1 = l1.next
            elif l1.val > l2.val:
                current.next = ListNode(l2.val)
                current = current.next
                l2 = l2.next
            else:
                current.next = ListNode(l1.val)
                current = current.next
                l1 = l1.next
                current.next = ListNode(l2.val)
                current = current.next
                l2 = l2.next
        return root


