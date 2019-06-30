package ReverseLinkedList.cpsky;

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
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        ListNode p = reverseList(node);
        System.out.println(p.val + p.next.val + p.next.next.val);
    }
    public static ListNode reverseList(ListNode head) {
        ListNode p = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            ListNode k = p;
            p = head;
            p.next = k;
            /*
             * head.next = p;
             * p = head;
             * */
            head = next;
        }
        return p;
    }
}