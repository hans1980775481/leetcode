package SymmetricTree.liuzhiqiang;


public class SymmerticTree {
    public boolean isSymmetric(TreeNode root) {
        if(null == root)
            return true;
        return isSymmetric(root.left,root.right);
    }

    public boolean isSymmetric(TreeNode left, TreeNode right) {
        if(null == left && null == right )
            return true;
        if(null == left || null == right )
            return false;

        return (left.val == right.val)
                && isSymmetric(left.left,right.right)
                && isSymmetric(left.right,right.left);
    }

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
