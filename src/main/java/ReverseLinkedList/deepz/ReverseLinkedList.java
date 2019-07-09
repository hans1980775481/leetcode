package ReverseLinkedList.deepz;

/**
 * @author DeepSleeping
 * @date 2019/7/4 10:12
 * @description 反转链表
 */
public class ReverseLinkedList {

    /**
     * 通过迭代反转
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }


    /**
     * 通过递归反转
     *
     * @param head
     * @return
     */
    public ListNode reverseList_(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = reverseList_(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
