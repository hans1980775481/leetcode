/**
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @return {TreeNode}
 */
var invertTree = function(root) {
  if (root == null || (root.left === null && root.right === null)) {
      return root;
  }     
  const left = root.left
  const right = root.right
  root.left = invertTree(right)
  root.right = invertTree(left)
  return root
};

/** 
 * 执行结果
 * 执行用时 : 80 ms, 在所有JavaScript提交中击败了90.33%的用户
 * 内存消耗 :33.6 MB, 在所有JavaScript提交中击败了65.09%的用户
*/