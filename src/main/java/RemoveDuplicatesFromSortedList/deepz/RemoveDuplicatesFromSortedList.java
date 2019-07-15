package RemoveDuplicatesFromSortedList.deepz;

/**
 * @author 张定平
 * @date 2019/7/15 16:51
 * @description 删除排序链表中的重复元素
 *
 * 执行用时 :1 ms, 在所有 Java 提交中击败了99.92% 的用户
 * 内存消耗 :36.8 MB, 在所有 Java 提交中击败了60.16%的用户
 */
public class RemoveDuplicatesFromSortedList {


    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        while (node != null && node.next != null) {
            ListNode temp = node.next;
            if (temp.val <= node.val) {
                node.next = node.next.next;
            } else {
                node = temp;
            }
        }
        return head;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
