package MergeTwoSortedLists.AzusaMutan;

public class Solution {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode p1 = l1;
        ListNode p2 = l2;
        int sm;
        if (l1.val <= l2.val) {
            sm = l1.val;
            p1 = p1.next;
        }
        else {
            sm = l2.val;
            p2 = p2.next;
        }

        ListNode l3 = new ListNode(sm);
        ListNode p3 = l3;

        while (p1 != null || p2 != null) {
            if (p1 == null) {
                p3.next = p2;
                p2 = p2.next;
                p3 = p3.next;
            } else if (p2 == null) {
                p3.next = p1;
                p1 = p1.next;
                p3 = p3.next;
            } else {
                if (p1.val <= p2.val) {
                    p3.next = p1;
                    p3 = p3.next;
                    p1 = p1.next;
                } else {
                    p3.next = p2;
                    p3 = p3.next;
                    p2 = p2.next;
                }
            }
        }

        return l3;
    }

}
