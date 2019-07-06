package MergeTwoSortedLists.SouthLinght_Lin;

/**
 * 合并两个有序链表
 * @author SouthLight-Lin on 2019/7/5
 */
public class MergeTwoLists {
    /**
     * 思路：
     *      使用归并排序
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null){
            return l2;
        }
        if (l2 == null){
            return l1;
        }

        ListNode curr = null;
        if (l1.val<=l2.val){
            curr = l1;
            l1 = l1.next;
        }else {
            curr = l2;
            l2 = l2.next;
        }
        ListNode head = curr;

        while (l1!=null || l2!=null){
            if (l1 == null){
                curr.next = l2;
                break;
            }
            else if (l2 == null){
                curr.next = l1;
                break;
            }
            else if (l1.val<=l2.val){
                curr.next = l1;
                curr = curr.next;
                l1 = l1.next;
            }
            else {
                curr.next = l2;
                curr = curr.next;
                l2 = l2.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        MergeTwoLists mergeTwoLists = new MergeTwoLists();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        node2.next = node3; node1.next=node2;
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(4);
        node5.next=node6; node4.next=node5;

        ListNode node = mergeTwoLists.mergeTwoLists(node1, null);
        while (node!=null){
            System.out.print(node.val+"->");
            node = node.next;
        }
        System.out.println("null");
    }
}
