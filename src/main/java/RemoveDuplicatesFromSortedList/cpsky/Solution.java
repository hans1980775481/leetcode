package RemoveDuplicatesFromSortedList.cpsky;

/**
 * \* Author: sky
 * \* Date: 2019/6/29
 * \* Description:
 * \
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
public class Solution {
    public static void main(String[] args) {
        ListNode p = new ListNode(1);
        p.next = new ListNode(1);
        p.next.next = new ListNode(2);
        p.next.next.next = new ListNode(2);
        p = deleteDuplicates(p);
        System.out.println(p.val + ' ' + p.next.val);
    }
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode list = head;

        while(list != null && list.next != null) {
            if (list.val == list.next.val) {
                list.next = list.next.next;
            } else {
                list = list.next;
            }
        }

        return head;
    }
}