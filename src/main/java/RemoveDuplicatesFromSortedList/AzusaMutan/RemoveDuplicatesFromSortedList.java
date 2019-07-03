package RemoveDuplicatesFromSortedList.AzusaMutan;

import java.util.HashSet;

public class RemoveDuplicatesFromSortedList {
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if (head == null) {
                return head;
            }
            HashSet<Integer> hashSet = new HashSet<>();
            ListNode newHead = new ListNode(head.val);
            hashSet.add(newHead.val);
            ListNode p = head;
            ListNode pp = newHead;
            while(p != null) {
                if (!hashSet.contains(p.val)) {
                    hashSet.add(p.val);
                    ListNode node = new ListNode(p.val);
                    pp.next = node;
                    p = p.next;
                    pp = pp.next;
                } else {
                    p = p.next;
                }
            }

            return newHead;
        }
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }


}


