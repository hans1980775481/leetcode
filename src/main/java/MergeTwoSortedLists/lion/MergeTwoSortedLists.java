package MergeTwoSortedLists.lion;

public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		ListNode p = new ListNode(0);
		ListNode q = p;
		while (l1 != null) {
			if (l2 == null) {
				p.next = l1;
				break;
			}
			if (l1.val <= l2.val) {
				p.next = l1;
				l1 = l1.next;
				p = p.next;
			} else {
				p.next = l2;
				l2 = l2.next;
				p = p.next;
			}
		}
		if (l1 == null) {
			p.next = l2;
		}
		return q.next;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
