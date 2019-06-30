package ReverseLinkedList.XMHans;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode result = null, temp;
        while (head != null) {
            temp = new ListNode(head.val);
            head = head.next;
            temp.next = result;
            result = temp;
        }
        return result;
    }
}
//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}