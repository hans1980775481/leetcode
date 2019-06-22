package SymmetricTree.yanxianni;

public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
		return isMirror(root, root);
	}

	public boolean isMirror(TreeNode t1, TreeNode t2) {
		//结束条件
		if (t1 == null && t2 == null) {
			return true;
		}
		if (t1 == null || t2 == null) {
			return false;
		}
		//递归
		return (t1.val == t2.val) && isMirror(t1.right, t2.left) && isMirror(t1.left, t2.right);
	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int data) {
			val = data;
		}
	}
}
