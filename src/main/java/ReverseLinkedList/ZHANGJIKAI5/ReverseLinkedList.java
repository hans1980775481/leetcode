package ReverseLinkedList.ZHANGJIKAI5;

/**
 * author：ZHANGJIKAI5
 * 题目：206. Reverse Linked List
 * 解题思路：1：迭代，2：递归
 */
public class ReverseLinkedList {

    /**
     * 迭代
     * 第一次执行：
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
     * Memory Usage: 37.1 MB, less than 99.87% of Java online submissions for Reverse Linked List.
     */
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode reverse = new ListNode(head.val);
        ListNode first;
        while (null != head.next) {
            first = new ListNode(head.next.val);
            first.next = reverse;
            reverse = first;
            head = head.next;
        }
        return reverse;
    }

    /**
     * 递归
     * 第一次执行：
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
     * Memory Usage: 37.1 MB, less than 99.84% of Java online submissions for Reverse Linked List.
     */
    public ListNode reverseList2(ListNode head) {
        if (head == null) {
            return null;
        }
        // 设置初始节点
        ListNode reverse = recursively(new ListNode(head.val), head.next);

        return reverse;
    }

    public ListNode recursively(ListNode reverse, ListNode head) {
        if (head == null) {
            return reverse;
        }
        ListNode first = new ListNode(head.val);
        first.next = reverse;
        reverse = first;
        return recursively(reverse, head.next);
    }

    /**
     * 生成链表
     */
    public ListNode generateListNode(ListNode listNode, int i) {
        if (i > 5) {
            return null;
        }
        i++;
        listNode.next = generateListNode(new ListNode(i), i);
        return listNode;
    }

    /**
     * test
     */
    public static void main(String[] args) {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ListNode head = reverseLinkedList.generateListNode(new ListNode(1), 1);
        System.out.println(reverseLinkedList.reverseList2(head));
    }

}
