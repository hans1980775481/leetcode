package SymmetricTree.weiyien;

/**
 * @auther: 魏薏恩
 * @date: 2019/6/20 17:41
 * @description: 对称满二叉树
 * @tag: 满二叉树 递归
 */
public class SymmetricTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }

    public boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if (left == null || right == null) {
            return false;
        } else if (left.val == right.val && isMirror(left.left, right.right) && isMirror(right.left, left.right)) {
            return true;
        }
        return false;
    }

}
