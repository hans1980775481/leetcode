package SymmetricTree.Dagon0577;

/**
 * @author Dagon0577
 * @date 2019/6/12 18:18
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return sameValue(root.left,root.right);
    }

    private boolean sameValue(TreeNode left,TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }
        if(left.val != right.val){
            return false;
        }
        return sameValue(left.left,right.right) && sameValue(left.right,right.left);
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
