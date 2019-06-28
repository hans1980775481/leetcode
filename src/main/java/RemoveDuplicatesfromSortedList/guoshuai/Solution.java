package RemoveDuplicatesfromSortedList83;
/*
 *  执行用时 :2 ms, 在所有 Java 提交中击败了87.49%的用户
	内存消耗 :37.8 MB, 在所有 Java 提交中击败了40.61%的用户
 */


public class Solution {
	public ListNode deleteDuplicates(ListNode head) {
		ListNode current = head;
		while (current != null && current.next != null) {
			if (current.next.val == current.val) {
				ListNode temp = current.next;
				current.next = temp.next;
				//temp.next = null;
			} else {
				current = current.next;
			}
		}
		return head;

	}

}