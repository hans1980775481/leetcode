package ReverseLinkedList.wangwangyuwan;


public class Solution {

    private static ListNode reverse(ListNode node) {
        ListNode head = null;
        ListNode pre = null;

        while (null != node) {
            ListNode next = node.next;
            if (null == next) {
                head = next;
            }
            node.next = pre;
            pre = node;
            node = next;
        }
        return head;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
