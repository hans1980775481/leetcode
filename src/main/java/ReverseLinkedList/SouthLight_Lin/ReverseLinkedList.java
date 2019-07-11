package ReverseLinkedList.SouthLight_Lin;

import java.util.Stack;

/**
 * 反转链表
 * @author SouthLight-Lin on 2019/7/2
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        /**
         * 遍历链表，将节点放入Stack栈中
         */
        Stack<ListNode> stack = new Stack<>();
        while (head!=null){
            stack.push(head);
            head = head.next;
        }

        // 创建新的链表
        // 头指针
        ListNode headNew = null;
        ListNode node = new ListNode(0);
        // 创建链头
        if (!stack.isEmpty()){
            node.val = stack.pop().val;
            // 头指针指向第一个Node
            headNew = node;
        }
        while (!stack.isEmpty()){
            node.next = new ListNode(stack.pop().val);
            node = node.next;
        }

        return headNew;
    }


    public ListNode reverseList2(ListNode head) {
        /**
         * 解法二：
         *      使用三个指针完成反转
         *      curr  当前在head中的指针
         *      prev  记录从curr遍历的节点，头插法
         *      nextTmp  临时记录curr.next
         */
        ListNode curr = head;
        ListNode prev = null;
        ListNode nextTmp = null;
        while (curr!=null) {
            // 记录curr的下一个节点，以便遍历下个节点
            nextTmp = curr.next;
            // 让当前节点的下个节点指向prev的反转节点
            curr.next = prev;
            // prev为新的反转节点
            prev = curr;
            // 下一个节点
            curr = nextTmp;
        }
        return prev;
    }


    public ListNode reverseList3(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = reverseList3(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }


    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node4.next=node5;node3.next=node4;node2.next=node3;
        node1.next=node2;
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ListNode reverseNode = reverseLinkedList.reverseList2(node1);
        while (reverseNode!=null){
            System.out.print(reverseNode.val+"->");
            reverseNode = reverseNode.next;
        }
        System.out.print("null");

    }
}
