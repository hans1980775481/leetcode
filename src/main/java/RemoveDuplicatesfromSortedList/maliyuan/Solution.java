package RemoveDuplicatesfromSortedList.maliyuan;

public class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (null == head) {
            return null;
        }
        ListNode p=head;
        ListNode q=head.next;
        while(q!=null) {
           if (p.val == q.val){
               p.next = q.next;
           }else {
               p =q;
           }
           q=q.next;
        }
        return head;
    }
}
