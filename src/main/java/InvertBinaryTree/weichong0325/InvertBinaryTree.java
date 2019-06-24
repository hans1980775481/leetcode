package InvertBinaryTree.weichong0325;

/**
 * Create by weichong0325 on 2019/6/12
 * leetcode-226:翻转二叉树
 * 解题思路：
 * 左右子树进行交换，递归调用
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            TreeNode left = root.left;
            TreeNode right = root.right;
            root.left = invertTree(right);
            root.right = invertTree(left);
        }
        return root;
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
