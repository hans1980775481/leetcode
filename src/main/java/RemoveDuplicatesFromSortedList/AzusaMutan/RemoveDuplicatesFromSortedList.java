package RemoveDuplicatesFromSortedList.AzusaMutan;

import java.util.HashSet;

public class RemoveDuplicatesFromSortedList {
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if (head == null) {
                return head;
            }
            ListNode pc = head;
            ListNode pn = head.next;
            while (pn != null) {
                if (pc.val == pn.val) {
                    pc.next = pn.next;
                } else {
                    pc = pc.next;
                }
                pn = pn.next;
            }
            return head;
        }
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }


}


