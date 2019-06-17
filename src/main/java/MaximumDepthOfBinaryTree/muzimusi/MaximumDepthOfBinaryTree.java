package MaximumDepthOfBinaryTree.muzimusi;


import sun.reflect.generics.tree.Tree;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        // 递归调用：左右子树高度最大者+1
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public static void main(String[] args) {
        TreeNode node3 = new TreeNode(3);
        TreeNode node9 = new TreeNode(9);
        TreeNode node20 = new TreeNode(20);
        TreeNode node15 = new TreeNode(15);
        TreeNode node7 = new TreeNode(7);
        node3.left = node9;
        node3.right = node20;
        node20.left = node15;
        node20.right = node7;
        int maxDepth = new MaximumDepthOfBinaryTree().maxDepth(node3);
        System.out.println(maxDepth);
    }
}
