package InvertBinaryTree.Jiucheng;

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode b = new ListNode(0);
        ListNode a = b;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                a.next = l2;
                l2 = l2.next;
            } else {
                a.next = l1;
                l1 = l1.next;
            }
            a = a.next;

        }
        if (l1 == null) {
            a.next = l2;
        }
        if (l2 == null) {
            a.next = l1;
        }
        return b.next;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
}
