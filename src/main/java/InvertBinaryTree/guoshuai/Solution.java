package InvertBinaryTree226;

/**
 * @author Pluto
 * @date 2019年6月28日 下午2:47:46
 * @description
 *  执行用时 :1 ms, 在所有 Java 提交中击败了82.20%的用户
	内存消耗 :34.9 MB, 在所有 Java 提交中击败了38.99%的用户
 */
public class Solution {
	public TreeNode invertTree(TreeNode root) {
		if (root == null || (root.left == null && root.right == null)) {
			return root;
		}
		TreeNode tmp;
		tmp = root.left;
		root.left = root.right;
		root.right = tmp;

		invertTree(root.left);
		invertTree(root.right);

		return root;

		/*
		 * 另
		 * TreeNode right=invertTree(root.right); 
		 * TreeNode left=invertTree(root.left);
		 * root.left=right; 
		 * root.right=left; 
		 * return root;
		 */
	}

}