public class InvertBinaryTree {
	public TreeNode invertTree(TreeNode root) {
		//结束条件
		if (root == null) {
			return root;
		}
		TreeNode left = root.left;
		TreeNode right = root.right;

		root.right = invertTree(left);
		root.left = invertTree(right);
		return root;
	}

	// 定义二叉树
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
}