
public class MaximumDepthOfBinaryTree {
	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		//×ó×ÓÊ÷
		int leftDepth = maxDepth(root.left) + 1;
		//ÓÒ×ÓÊ÷
		int rightDepth = maxDepth(root.right) + 1;
		return leftDepth > rightDepth ? leftDepth : rightDepth;
	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
}
