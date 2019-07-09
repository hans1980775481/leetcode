package ReverseLinkedList.wangyuhuich;

/**
 * 反转一个单链表。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * <p>
 * 执行用时 :0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗 :36.3 MB, 在所有 Java 提交中击败了55.78%的用户
 */

public class ReverselinkedList {

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode start = null;
        ListNode tail = null;
        while (head != null) {
            ListNode middle = new ListNode(head.val);
            middle.next = tail;
            tail = middle;
            start = middle;
            head = head.next;
        }
        return start;
    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
