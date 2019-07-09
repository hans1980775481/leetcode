package MergeTwoSortedLists.cpsky;

/**
 * \* Author: sky
 * \* Date: 2019/6/29
 * \* Description:
 * \
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
public class Solution {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(7);
        l2.next = new ListNode(8);
        l2.next.next = new ListNode(9);
        mergeTwoLists(l1, l2);
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode p = head;
        while (l1 != null && l2 != null)  {
            if (l1.val > l2.val) {
                p.next = l2;
                l2 = l2.next;
            } else {
                p.next = l1;
                l1 = l1.next;
            }
            p = p.next;
        }
        p.next = l1 == null ? l2 : l1;
        return head.next;
    }
}