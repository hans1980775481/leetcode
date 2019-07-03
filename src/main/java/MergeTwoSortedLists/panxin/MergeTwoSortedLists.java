package MergeTwoSortedLists.panxin;


public class MergeTwoSortedLists {

    public static void main(String[] args) {
        //1->2->4, 1->3->4
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(9);
        l1.next.next.next = new ListNode(13);
        l1.next.next.next.next = new ListNode(14);
        l1.next.next.next.next.next = new ListNode(15);
        l1.next.next.next.next.next.next = new ListNode(16);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode listNode = new Solution().mergeTwoLists(l1, l2);
        System.out.println(listNode);
        print(listNode);
    }

    static void print(ListNode listNode) {
        if (listNode.next != null) {
            System.out.print(listNode.val + ", ");
            print(listNode.next);
        } else {
            System.out.print(listNode.val);
        }

    }

}
