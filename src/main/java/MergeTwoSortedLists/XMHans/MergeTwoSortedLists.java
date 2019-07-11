package MergeTwoSortedLists.XMHans;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode pre1 = l1, result = l1, temp;
        boolean flag = true;
        while (true) {
            if (l1.val <= l2.val) {
                pre1 = l1;
                l1 = l1.next;
            } else {
                if (flag) {
                    pre1 = l2;
                    l2 = l2.next;
                    pre1.next = l1;
                } else {
                    temp = l2;
                    l2 = l2.next;
                    temp.next = pre1.next;
                    pre1.next = temp;
                    pre1 = temp;
                }

            }
            flag = false;
            if (l1 == null || l2 == null) break;
        }
        if (l2 != null) {
            pre1.next = l2;
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
