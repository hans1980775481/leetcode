package ReverseLinkedList.yangshuai;

/**
 * Solution
 *
 * @author shuai
 * @date 2019/7/8
 */
public class Solution {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        ListNode node = reverseList(node1);
        System.out.println(node);
    }

    public static ListNode reverseList(ListNode head) {

        ListNode prev = head;
        if (head != null) {
            ListNode cur = head.next;
            head.next = null;
            while (cur != null) {
                ListNode next = cur.next;
                cur.next = prev;
                prev = cur;
                cur = next;
            }
        }
        return prev;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
