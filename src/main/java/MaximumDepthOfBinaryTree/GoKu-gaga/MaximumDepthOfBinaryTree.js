/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number}
 */
var maxDepth = function(root) {   
  return root === null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1
};

/** 
 * 执行结果
 * 执行用时 : 84 ms, 在所有JavaScript提交中击败了97.53%的用户
 * 内存消耗 : 37 MB, 在所有JavaScript提交中击败了57.94%的用户
*/