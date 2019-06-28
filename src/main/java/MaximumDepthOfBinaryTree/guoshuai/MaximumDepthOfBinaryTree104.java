package test;

import test.SymmetricTree101.TreeNode;
/*
 *  执行用时 :1 ms, 在所有 Java 提交中击败了96.82%的用户
	内存消耗 :37.2 MB, 在所有 Java 提交中击败了50.13%的用户
 */

public class MaximumDepthOfBinaryTree104 {
	public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
	public int maxDepth(TreeNode root) {
	    if(root == null) return 0;
	    return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
	}

}
