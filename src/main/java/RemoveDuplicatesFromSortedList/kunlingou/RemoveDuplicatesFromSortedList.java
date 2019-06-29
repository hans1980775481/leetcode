package RemoveDuplicatesFromSortedList.kunlingou;

public class RemoveDuplicatesFromSortedList {
	public static void main(String[] args) {
		ListNode h = new ListNode(1);
		ListNode c;
		h.next = new ListNode(1);
		c = h.next;
		c.next = new ListNode(1);
		deleteDuplicates(h);
		System.out.println();
	}
	
	public static ListNode deleteDuplicates(ListNode head) {
		if(head == null) return head;
        ListNode cur = head;
        while(cur.next != null){
            if(cur.val == cur.next.val)
                cur.next = cur.next.next;
            else
                cur = cur.next;
        }
        return head;
    }
}
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}