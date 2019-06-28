package RemoveDuplicatesfromSortedList.weiyien;

/**
 * @auther: 魏薏恩
 * @date: 2019/6/25 17:30
 * @description:
 */
public class RemoveDuplicatesfromSortedList {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode first = head;
        while (head != null) {
            if (head.next == null) {
                break;
            } else if (head.next.val == head.val) {
                if (head.next.next == null) {
                    head.next = null;
                    break;
                } else {
                    head.next = head.next.next;
                }
            } else {
                head = head.next;
            }
        }
        return first;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
