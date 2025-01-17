package RemoveDuplicatesFromSortedList.lefthand;

public class RemoveDuplicatesFromSortedList {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node = head;
        while (node.next != null) {
            if (node.val != node.next.val) {
                node = node.next;
            } else {
                node.next = node.next.next;
            }

        }
        return head;
    }
}
