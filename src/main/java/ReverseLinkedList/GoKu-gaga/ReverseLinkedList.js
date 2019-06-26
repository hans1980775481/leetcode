/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var reverseList = function(head) {
  let pre = null
  while (head) {
      next = head.next
      head.next = pre
      pre = head
      head = next
  }
  return pre
};

/** 
 * 执行结果
 * 执行用时 : 80 ms, 在所有JavaScript提交中击败了 94.76% 的用户
 * 内存消耗 : 35.3 MB, 在所有JavaScript提交中击败了 21.07% 的用户
*/