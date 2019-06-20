package InvertBinaryTree.weiyien;

/**
 * @auther: weiyien
 * @date: 2019/6/20 16:34
 * @description: 翻转二叉树
 * @tag: 二叉树 递归
 */
public class InvertBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.right);
        TreeNode right = invertTree(root.left);
        root.left = left;
        root.right = right;
        return root;
    }
}
