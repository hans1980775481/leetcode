package MergeTwoSortedLists.LiuMinghao;

import ReverseLinkedList.LiuMinghao.ReverseLinkedList;

public class mergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode resolt = new ListNode(-1);
        ListNode pro = resolt;
        while(true){
            if(l1 == null ){
                resolt.next=l2;
                return pro.next;
            }
            if(l2 == null){
                resolt.next =l1;
                return pro.next;
            }
            if(l1.val<=l2.val){
                resolt.next = l1;
                l1=l1.next;
                resolt=resolt.next;
            }else {
                resolt.next = l2;
                l2=l2.next;
                resolt=resolt.next;
            }
        }
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode12 = new ListNode(2);
        ListNode listNode13 = new ListNode(4);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode22 = new ListNode(3);
        ListNode listNode23 = new ListNode(4);
        listNode1.next=listNode12;
        listNode12.next=listNode13;
        listNode2.next=listNode22;
        listNode22.next=listNode23;
        System.out.println(mergeTwoSortedLists.mergeTwoLists(listNode1,listNode2));
    }
}
