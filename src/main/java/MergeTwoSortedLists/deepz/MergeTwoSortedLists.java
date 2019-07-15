package MergeTwoSortedLists.deepz;

/**
 * @author DeepSleeping
 * @date 2019/7/15 22:05
 * @description 合并两个有序列表
 * 执行用时 :2 ms, 在所有 Java 提交中击败了91.60% 的用户
 * 内存消耗 :37 MB, 在所有 Java 提交中击败了82.33%的用户
 */
public class MergeTwoSortedLists {


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
