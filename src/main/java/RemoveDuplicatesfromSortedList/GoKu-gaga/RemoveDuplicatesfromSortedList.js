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
var deleteDuplicates = function(head) {
  // if (!head || !head.next) {
  //     return head
  // }
  // head.next = deleteDuplicates(head.next)
  // if (head.val === head.next.val) {
  //     head = head.next
  // }
  // return head
  let current = head;
  while (current) {
      if (current.next && current.val === current.next.val) {
          current.next = current.next.next;
      } else {
          current = current.next;
      }
  }
  return head;
};

// 执行用时 : 104 ms, 在Move Zeroes的JavaScript提交中击败了 81.40% 的用户
// 内存消耗 : 36.6 MB, 在Move Zeroes的JavaScript提交中击败了 7.72% 的用户