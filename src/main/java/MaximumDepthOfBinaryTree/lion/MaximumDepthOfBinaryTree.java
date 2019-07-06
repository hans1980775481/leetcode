package MaximumDepthOfBinaryTree.lion;

public class MaximumDepthOfBinaryTree {
	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return 1;
		}
		if (root.left != null && root.right == null) {
			return 1 + maxDepth(root.left);
		}
		if (root.left == null && root.right != null) {
			return 1 + maxDepth(root.right);
		}
		return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));

	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}
