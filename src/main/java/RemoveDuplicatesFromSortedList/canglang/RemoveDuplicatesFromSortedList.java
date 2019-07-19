/**
 * 
 *
 *
 * @author£º charles
 * @date£º 2019-07-19 21:58
 */
public class RemoveDuplicatesFromSortedList {
	public static ListNode deleteDuplicates(ListNode head) {
		ListNode p=head;
		while (p!=null) {
            if(p.next==null) break;
			else if(p.val==p.next.val) {
				p.next=p.next.next;
			}
            else{
                p=p.next;
                }
		}
        return head;
    }
}