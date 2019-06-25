package ReverseLinkedList.weiyien;

import java.util.Stack;

/**
 * @auther: 魏薏恩
 * @date: 2019/6/25 11:39
 * @description:
 */
public class ReverseLinkedList {


    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        if (!stack.empty()) {
            ListNode last = stack.pop();
            ListNode t = last;
            while (!stack.empty()) {
                ListNode listNode = stack.pop();
                t.next = listNode;
                t = t.next;
            }
            t.next = null;
            return last;
        } else {
            return head;
        }

    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);

        ListNode res = reverseList(l1);
        while (res != null) {
            System.out.println(res.toString());
            res = res.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return this.val + "->";
    }
}