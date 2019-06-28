package RemoveDuplicatesFromSortedList.XMHans;

public class RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode preNode = head, result = head;
        int preVal = head.val;
        head = head.next;
        while (head != null) {
            if (head.val == preVal) {
                preNode.next = head.next;
            } else {
                preVal = head.val;
                preNode = head; // 当找到不同值的时候才移动前指针
            }

            head.next = head;
        }
        return result;
    }
}


// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
