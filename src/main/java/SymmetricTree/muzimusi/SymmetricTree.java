package SymmetricTree.muzimusi;

//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}


public class SymmetricTree {
    // 翻转任何一个子树：若左右子树一致则原树是镜像树
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        // 翻转左子树
        TreeNode leftRoot = revertBinaryTree(root.left);
        // 判断左子树和右子树是否一致
        return isSameTree(leftRoot, root.right);
    }

    private TreeNode revertBinaryTree(TreeNode root) {
        if (root == null)
            return root;
        TreeNode leftRoot = revertBinaryTree(root.left);
        TreeNode rightRoot = revertBinaryTree(root.right);
        root.left = rightRoot;
        root.right = leftRoot;
        return root;
    }

    private Boolean isSameTree(TreeNode leftRoot, TreeNode rightRoot) {
        // 遍历树
        String rightPreTravelRes = preTravel(rightRoot);
        String rightInTravelRes = inTravel(rightRoot);
        // 遍历树
        String leftPreTravelRes = preTravel(leftRoot);
        String leftInTravelRes = inTravel(leftRoot);
        // 判断两棵树是否相同
        if (leftPreTravelRes == null && rightPreTravelRes == null ||
                leftPreTravelRes != null && rightPreTravelRes != null
                        && leftPreTravelRes.equals(rightPreTravelRes)
                        && leftInTravelRes.equals(rightInTravelRes))
            return true;
        return false;
    }

    private String preTravel(TreeNode root) {
        if (root == null)
            return null;
        return root.val + preTravel(root.left) + preTravel(root.right);
    }

    private String inTravel(TreeNode root) {
        if (root == null)
            return null;
        return inTravel(root.left) + root.val + inTravel(root.right);
    }
}