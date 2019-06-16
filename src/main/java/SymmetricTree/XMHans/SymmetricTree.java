package SymmetricTree.XMHans;

public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isMirror(root.left,root.right);
    }

    public boolean isMirror(TreeNode left, TreeNode right) {
        if (left != null && right != null && left.val == right.val )  {
            if (isMirror(left.right,right.left) && isMirror(left.left,right.right)) return true;
            return false;
        }
        else if (left == null && right == null) return true;
        else return false;
    }
}

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}