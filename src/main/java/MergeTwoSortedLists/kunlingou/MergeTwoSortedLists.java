package MergeTwoSortedLists.kunlingou;

public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		ListNode h = new ListNode(-1), cur = h;
		while (l1 != null || l2 != null) {
			if (l1 == null) {
				cur.next = l2;
				break;
			}
			;
			if (l2 == null) {
				cur.next = l1;
				break;
			}
			;
			if (l1.val <= l2.val) {
				cur.next = l1;
				l1 = l1.next;
			} else {
				cur.next = l2;
				l2 = l2.next;
			}
			cur = cur.next;
		}
		return h.next;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}