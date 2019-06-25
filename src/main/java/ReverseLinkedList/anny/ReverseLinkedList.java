package ReverseLinkedList.anny;
/**
 * @auther: anny
 * @date: 2019/6/25 16:16
 * @description:
 */
public class ReverseLinkedList {
    /**
     * Definition for singly-linked list.
     */

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        ListNode cur = head;
        ListNode before = null;
        while(cur != null){
            ListNode pNext = cur.next;
            if(pNext==null){
                newHead = cur;
            }
            cur.next = before;
            before = cur;
            cur = pNext;
        }
        return newHead;

    }

    public static void main(String[] args) {

    }
}
