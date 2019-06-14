/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @return {boolean}
 */
var isSymmetric = function(root) {
  function isMirror (left, right) {
      if (left === null && right === null) {
          return true
      }
      if (left !== null && right !== null && left.val === right.val) {
          return isMirror(left.left, right.right) && isMirror(left.right, right.left)
      }
      return false
  }
  
  return root === null ? true : isMirror(root, root)
};


/** 
 * 执行结果
 * 执行用时 : 88 ms, 在所有JavaScript提交中击败了92.04%的用户
 * 内存消耗 : 35.4 MB, 在所有JavaScript提交中击败了56.59%的用户
*/