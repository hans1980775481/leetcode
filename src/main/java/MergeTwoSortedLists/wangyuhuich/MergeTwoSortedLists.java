package MergeTwoSortedLists.wangyuhuich;

/**
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 * <p>
 * 示例：
 * <p>
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 *
 * 执行用时 :2 ms, 在所有 Java 提交中击败了94.20%的用户
 * 内存消耗 :36 MB, 在所有 Java 提交中击败了87.48%的用户
 */


public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        } else if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else {
            ListNode result = new ListNode(0);
            ListNode current = result;
            ListNode middle = null;
            while (l1 != null && l2 != null) {

                if (l1.val > l2.val) {
                    middle = new ListNode(l2.val);
                    l2 = l2.next;
                } else {
                    middle = new ListNode(l1.val);
                    l1 = l1.next;
                }
                current.next = middle;
                current = middle;
            }
            if (l1 == null) {
                middle.next = l2;
            } else if(l2==null){
                middle.next = l1;
            }
            return result.next;
        }
    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
