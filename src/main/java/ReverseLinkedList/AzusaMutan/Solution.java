package ReverseLinkedList.AzusaMutan;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }

class Solution {
    public ListNode p;
    public ListNode reverseList(ListNode head) {
        if (head == null) return head;
        f(head).next = null;
        return p;
    }

    public ListNode f (ListNode node) {
        if (node.next != null) {
            f(node.next).next = node;
            return node;
        } else {
            p = node;
            return node;
        }
    }
}
