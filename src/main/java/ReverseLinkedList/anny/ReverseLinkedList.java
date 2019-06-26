package ReverseLinkedList.anny;

import com.sun.corba.se.impl.protocol.giopmsgheaders.LocateReplyMessage_1_0;

/**
 * @auther: anny
 * @date: 2019/6/25 16:16
 * @description:
 */
public class ReverseLinkedList {
    /**
     * Definition for singly-linked list.
     */

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;//新链表的头结点
        ListNode cur = head;//遍历链表的当前指针
        ListNode before = null;
        while(cur != null){
            ListNode next=cur.next;
            if(null==next){
                newHead=cur;
            }
            cur.next=before;
            before=cur;
            cur=next;
        }
        return newHead;

    }
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode cur = head.next;
        ListNode before = head;
        while (null != cur) {
            if (cur.val == before.val) {
                before.next = cur.next;
            }
            cur = cur.next;
        }
        return head;
    }
    //Input: 1->2->4, 1->3->4
    //Output: 1->1->2->3->4->4
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = l1.val <= l2.val ? l1 : l2;
        ListNode indexLow = head;
        ListNode indexHigh = l1.val > l2.val ? l1 : l2;
        while (indexLow != null) {
            ListNode next = indexLow.next;
            //小链表当前节点的下一个大于另一个当前节点，另一个当前节点加到当前的后面
            if (next != null && next.val > indexHigh.val) {
                indexLow.next = indexHigh;
                indexHigh = next;
            }
            if(indexLow.next==null){
                indexLow.next=indexHigh;
                break;
            }
            indexLow=indexLow.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(4);
        ListNode m1 = new ListNode(1);
        ListNode m2 = new ListNode(3);
        ListNode m3 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        m1.next = m2;
        m2.next = m3;
        ListNode node=mergeTwoLists(l1, m1);
        while (null!=node){
            System.out.printf(node.val+"");
            node=node.next;
        }
    }
}
