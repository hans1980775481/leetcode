package MergeTwoSortedLists.maliyuan;

public class Solution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p = new ListNode(0);
        ListNode q = p;
        while ( l1!=null && l2!=null){
            if(l1.val >= l2.val ){
                q.next=l2;
                q=q.next;
                l2=l2.next;
            }else{
                q.next=l1;
                q=q.next;
                l1=l1.next;
            }
        }
        if(l1!=null){
            q.next=l1;
        }
        if(l2!=null){
            q.next=l2;
        }
        return p.next;
    }

}
