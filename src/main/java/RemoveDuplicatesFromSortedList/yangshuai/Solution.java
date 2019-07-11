package RemoveDuplicatesFromSortedList.yangshuai;

/**
 * Solution
 *
 * @author shuai
 * @date 2019/7/10
 */
public class Solution {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        deleteDuplicates(node1);

        System.out.println(node1);


    }

    public static ListNode deleteDuplicates(ListNode head) {

        if (head != null) {
            ListNode prev = head;
            ListNode curr = head.next;
            while (curr != null) {
                if (curr.val == prev.val) {
                    prev.next = curr.next;
                } else {
                    prev = curr;
                }
                curr = curr.next;
            }
        }
        return head;

    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}