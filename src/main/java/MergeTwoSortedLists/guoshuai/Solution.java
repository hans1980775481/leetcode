package MergeTwoSortedLists21;

/**
 * @author Pluto
 * @date 2019年6月27日 下午12:34:18
 * @description
 *  执行用时 :2 ms, 在所有 Java 提交中击败了94.83%的用户
	内存消耗 :36.3 MB, 在所有 Java 提交中击败了87.29%的用户
 */
public class Solution {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		} else if (l2 == null) {
			return l1;
		} else if (l1.val < l2.val) {
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else{
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
	}
	


}