/**
 * 
 * @author charles_lai
 *
 */

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}
public class ReverseLinkedList {
	public static ListNode reverseList(ListNode head) {
		if(head==null){
            return null;
        }
        ListNode t=head;
		ListNode n,p;
		p=null;
        n=t.next;
		while (t!=null) {
			n=t.next;
			t.next=p;
            if(n==null){
                break;
            }
			p=t;t=n;
            n=n.next;
		}
        return t;
    }
}
