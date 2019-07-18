package ReverseLinkedList.LiuMinghao;

public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {
        ListNode pro = null;
        ListNode next = head;
        while (next != null) {
            ListNode temp = next.next;
            next.next = pro;
            pro = next;
            next = temp;
        }
        return pro;
    }
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        ReverseLinkedList.reverseList(listNode1);
    }
}