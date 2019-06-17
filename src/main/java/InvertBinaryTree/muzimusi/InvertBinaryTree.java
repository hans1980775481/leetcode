package InvertBinaryTree.muzimusi;


//  Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return root;
        // 递归翻转左子树
        TreeNode leftRoot = invertTree(root.left);
        // 递归翻转右子树
        TreeNode rightRoot = invertTree(root.right);
        // 交换左右子树
        root.left = rightRoot;
        root.right = leftRoot;
        return root;
    }
}
