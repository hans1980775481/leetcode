package RemoveDuplicatesfromSortedList.SouthLight_Lin;

import java.util.HashMap;

/**
 * 去除链表中的重复元素
 * 比如：
 *      输入：1->1->2->null
 *      输出：1->2->null
 * @author SouthLight-Lin on 2019/7/2
 */
public class DeleteDuplicates {

    /**
     * 解法一：
     *      通过判断curr.next.val == curr.val，如果相等则改变curr.next的指针
     *      curr.next = curr.next.next
     */
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while(curr!=null){
            if (curr.next!=null && curr.next.val == curr.val){
                curr.next = curr.next.next;
            }
            else if (curr.next == null){
                break;
            }
            else{
                curr = curr.next;
            }
        }
        return head;
    }


    public ListNode deleteDuplicates2(ListNode head) {

        /**
         * 思路二（但没有第一种解法高效）：
         *      用一个TreeMap存放无重复的数
         *      遍历遍历链表，如果数已经在TreeMap中，则去除
         *      用两个指针，prev指向没有重复的前面节点的最后一个节点
         *      curr遍历节点
         */
        if (head==null){
            return head;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        ListNode curr = head;
        ListNode prev = null;

        while (curr!=null){
            // 如果该数已经存在
            if (map.get(curr.val)!=null) {
                // 直接跳过
                curr = curr.next;
            }
            // 如果该数没出现过
            else {
                map.put(curr.val, curr.val);
                if (prev==null){
                    prev = curr;
                }else {
                    prev.next = curr;
                    prev = prev.next;
                }
                curr = curr.next;
            }
        }
        // 空指针也要添加
        prev.next = curr;

        return head;
    }





    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(3);
        node4.next=node5;node3.next=node4;node2.next=node3;
        node1.next=node2;
        DeleteDuplicates deleteDuplicates = new DeleteDuplicates();
        ListNode node = deleteDuplicates.deleteDuplicates(node1);
        while (node!=null){
            System.out.print(node.val+"->");
            node = node.next;
        }
        System.out.println("null");
    }
}

class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val = val;
        this.next = null;
    }
}