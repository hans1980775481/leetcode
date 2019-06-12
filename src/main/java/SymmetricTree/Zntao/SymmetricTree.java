package SymmetricTree.Zntao;

public class SymmetricTree {


    public boolean isSymmetric(TreeNode root) {


        return isMirror(root, root);
    }

    public boolean isMirror(TreeNode t1, TreeNode t2) {
        if (null == t1 && null == t2){
            return true;
        }
        if (null == t1 || null == t2){
            return false;
        }
        return  (t1.val == t2.val && isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left));
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}