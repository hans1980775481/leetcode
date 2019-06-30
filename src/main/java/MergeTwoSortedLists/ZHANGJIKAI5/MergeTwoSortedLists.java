package MergeTwoSortedLists.ZHANGJIKAI5;


/**
 * author：ZHANGJIKAI5
 * 题目：21. Merge Two Sorted Lists
 * 解题思路：使用了归并排序的思路，递归调用
 */
public class MergeTwoSortedLists {

    /**
     * 第n次执行（效率上和方法一差不多，但是听从了L N W老哥给的建议，使用了归并排序，代码比较优雅）：
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Two Sorted Lists.
     * Memory Usage: 39.6 MB, less than 27.45% of Java online submissions for Merge Two Sorted Lists.
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode result;
        if(l1.val <= l2.val) {
            result = new ListNode(l1.val);
            result.next = mergeTwoLists(l1.next, l2);
        } else {
            result = new ListNode(l2.val);
            result.next = mergeTwoLists(l1, l2.next);
        }
        return result;
    }

    /**
     * 第n次执行（时间复杂度较低，但内存使用较高。空间换时间了，代码写的一点都不好看（非常丑陋））：
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Two Sorted Lists.
     * Memory Usage: 39.6 MB, less than 27.39% of Java online submissions for Merge Two Sorted Lists.
     */
    public ListNode mergeTwoLists_1(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode copy = l1;
        ListNode copyPrevious = null;
        while (null != copy) {
            if (null == l2) {
                return l1;
            }
            if (copy.val <= l2.val) {
                copyPrevious = copy;
                copy = copy.next;
            } else {
                ListNode temp = new ListNode(l2.val);
                l2 = l2.next;
                temp.next = copy;
                if (null == copyPrevious) {
                    copy = temp;
                    l1 = copy;
                    continue;
                }
                copyPrevious.next = temp;
                copyPrevious = copyPrevious.next;
            }
        }
        if (null != l2) {
            copyPrevious.next = l2;
        }
        return l1;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(4);
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(3);
        head2.next.next = new ListNode(3);

        ListNode head3 = new ListNode(2);
        ListNode head4 = new ListNode(1);

        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        mergeTwoSortedLists.mergeTwoLists(head1, head2);
    }

}
