package InvertBinaryTree.Jiucheng;

public class ReverseList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode b = reverseList(head.next);
        ListNode a = head.next;
        a.next = head;
        head.next = null;
        return b;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
}
