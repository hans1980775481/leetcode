package RemoveDuplicatesfromSortedList.wangyuhuich;
/**
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->1->2
 * 输出: 1->2
 * 示例 2:
 * <p>
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 *
 * 执行用时 :2 ms, 在所有 Java 提交中击败了90.00%的用户
 * 内存消耗 :37 MB, 在所有 Java 提交中击败了54.87%的用户
 */
public class RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode current = head;
        ListNode middle = head.next;

        while (middle != null) {
            if(middle.val==current.val){
                middle = middle.next;
                current.next = null;
            }else{
                current.next = middle;
                current = current.next;
                middle = middle.next;
            }
        }
        return head;
    }

    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
}
