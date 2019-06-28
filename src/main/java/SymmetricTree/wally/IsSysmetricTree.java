package SymmetricTree.wally;

/**
 * @author wally
 */
public class IsSysmetricTree {
    public boolean isSymmetric(TreeNode root){

        return isMirror(root,root);
    }
    public boolean isMirror(TreeNode t1,TreeNode t2){

        if (t1 == null && t2 == null){
            return true;
        }
        if (t1 == null || t2 == null){
            return false;
        }
        return (t1.val == t2.val) && t1.left == t2.right && t1.right == t2.left;
    }
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }
}
