/**
 * 
 *
 *
 * @author£º charles
 * @date£º 2019-07-19 22:09
 */
public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head=null;
        ListNode p1,p2;
        if(l1==null&&l2==null) return null;
        if(l1==null) return l2;
        if(l2==null) return l1;
        if(l1.val<=l2.val) {
        	head=l1;
        	p1=l1;
        	p2=l2;
        }
        else {
        	p1=l2;
        	p2=l1;
        	head=l2;
        }
        while(p1.next!=null) {
            if(p2==null) break;
        	if(p2.val>=p1.val&&p2.val<=p1.next.val) {
        		ListNode t=new ListNode(p2.val);
        		t.next=p1.next;
        		p1.next=t;
        		p2=p2.next;
        	}
        	else {
        			p1=p1.next;
        	}
        }
        if (p2!=null){
            p1.next=p2;
        }
        return head;
    }
}
