package RemoveDuplicatesfromSortedList.ZHANGJIKAI5;

import java.util.HashSet;

/**
 * author：ZHANGJIKAI5
 * 题目：83. Remove Duplicates from Sorted List
 * 解题思路：对head的copy（引用变量）进行去重操作，链表是一个，所以最终操作会作用到head。
 * 一开始忽略了引用变量的性质，mdzz。
 */
public class RemoveDuplicatesFromSortedList {

    /**
     * 第三次执行：
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Duplicates from Sorted List.
     * Memory Usage: 36.4 MB, less than 99.98% of Java online submissions for Remove Duplicates from Sorted List.
     * @param head
     * @return
     */
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode copy = head;
        while (copy != null && copy.next != null) {
            if (copy.val == copy.next.val) {
                copy.next = copy.next.next;
            } else {
                copy = copy.next;
            }
        }
        return head;
    }

    /**
     * 第二次执行（时间复杂度太高，垃圾）：
     * Runtime: 2 ms, faster than 5.91% of Java online submissions for Remove Duplicates from Sorted List.
     * Memory Usage: 36.8 MB, less than 99.96% of Java online submissions for Remove Duplicates from Sorted List.
     * @param head
     * @return
     */
    public ListNode deleteDuplicates_2(ListNode head) {
        if (head == null) {
            return null;
        }
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(head.val);
        ListNode result = new ListNode(head.val);
        // 处理
        while (null != head.next) {
            // 当set中不包含当前元素时
            if (!hashSet.contains(head.next.val)) {
                // head指向下一个
                result = last(result, head.next.val, hashSet.size()-1);
                // 添加到set中
                hashSet.add(head.next.val);
            }
            head = head.next;
        }

        return result;
    }

    private ListNode last(ListNode last, int val, int size) {
        if (size > 0) {
            size--;
            last(last.next, val, size);
        } else {
            last.next = new ListNode(val);
        }
        return last;
    }

    /**
     * 第一次执行（时间复杂度太高，垃圾）：
     * Runtime: 2 ms, faster than 5.91% of Java online submissions for Remove Duplicates from Sorted List.
     * Memory Usage: 36.8 MB, less than 99.96% of Java online submissions for Remove Duplicates from Sorted List.
     * @param head
     * @return
     */
    public ListNode deleteDuplicates_1(ListNode head) {
        if (head == null) {
            return null;
        }
        // 处理
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(head.val);
        ListNode reverse = new ListNode(head.val);
        while (null != head.next) {
            if (!hashSet.contains(head.next.val)) {
                // 将当前值放到set中
                hashSet.add(head.next.val);
                reverse = reverse(reverse, head.next.val);
            }
            head = head.next;
        }
        ListNode first = new ListNode(reverse.val);
        while (null != reverse.next) {
            first = reverse(first, reverse.next.val);
            reverse = reverse.next;
        }
        return first;
    }

    private ListNode reverse(ListNode reverse, int val) {
        ListNode first = new ListNode(val);
        first.next = reverse;
        return first;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList = new RemoveDuplicatesFromSortedList();
        ListNode print = removeDuplicatesFromSortedList.deleteDuplicates(head);
    }
}
