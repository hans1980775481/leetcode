package ReverseLinkedList.lion;

public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		ListNode p = null;
		ListNode q = head;
		while (head != null) {
			head = head.next;
			q.next = p;
			p = q;
			q = head;
		}
		return p;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}