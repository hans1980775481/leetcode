package MergeTwoSortedLists.amokay;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next(new ListNode(2))
                .next(new ListNode(3))
                .next(new ListNode(4))
                .next(new ListNode(5));

        Solution solution = new Solution();
        ListNode listNode = solution.reverseList(head);
        head.next = null;
        while (listNode != null) {
            System.out.println(listNode);
            listNode = listNode.next;
        }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode reverse = reverse(head);
        head.next = null;
        return reverse;
    }

    public ListNode reverse(ListNode head) {
        if (head.next != null) {
            ListNode listNode = reverseList(head.next);
            head.next.next = head;
            return listNode;
        } else {
            return head;
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public ListNode next(ListNode listNode) {
        this.next = listNode;
        return listNode;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                '}';
    }
}