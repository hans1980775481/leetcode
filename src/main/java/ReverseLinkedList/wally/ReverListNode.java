package ReverseLinkedList.wally;

public class ReverListNode {
    class solution{
        public ListNode reverListNode(ListNode head){
            if (head == null || head.next == null){
                return head;
            }
            ListNode p = reverListNode(head.next);
            head.next.next = head;
            head.next = null;
            return p;
        }
    }
}
class ListNode{
    int val;
    ListNode(int x){
        this.val = x;
    }
    ListNode next;
}
