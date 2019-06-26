package ReverseLinkedList.maliyuan;

public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode p = null;
        ListNode q = head;
        while (q != null) {
            ListNode temp = q.next;
            q.next = p;
            p = q;
            q = temp;
        }
        return p;
    }
}
