package ReverseLinkedList.zhaodh;

/**
 * 反转一个单链表。
 * 示例：
 * 输入: 1->2->3->4->5
 * 输出: 5->4->3->2->1
 */
public class ReverseLinkedList {

    /**
     * 反转单链表：循环
     *
     * @param head
     */
    public static ListNode reverseLinkedList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        ListNode next;
        ListNode pre = null;
        while (head != null) {
            // 将当前节点的下个节点作为头节点 保存
            next = head.next;
            // 将上个节点当作当前节点的下个节点
            head.next = pre;
            // 把当前节点当做上个节点
            pre = head;
            // 替换头节点
            head = next;
        }
        return pre;
    }



    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next(new ListNode(2))
                .next(new ListNode(3))
                .next(new ListNode(4))
                .next(new ListNode(5));
        System.out.println(listNode);
        System.out.println(reverseLinkedList(listNode));
    }

    /**
     * 单项链表
     */
    static class ListNode {
        Object data;
        ListNode next;

        public ListNode(Object data) {
            this.data = data;
        }

        public ListNode next(ListNode listNode) {
            this.next = listNode;
            return listNode;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            ListNode listNode = this;
            do {
                sb.append(listNode.data);
                if (listNode.next == null) {
                    break;
                }
                sb.append("->");
                listNode = listNode.next;
            } while (true);
            return sb.toString();
        }
    }
}
