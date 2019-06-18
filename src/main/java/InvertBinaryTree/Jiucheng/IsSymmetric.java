package InvertBinaryTree.Jiucheng;

public class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        return isSame(root,root);
    }
    public boolean isSame(TreeNode t1,TreeNode t2){
        if(t1==null&&t2==null)return true;
        if(t1==null||t2==null)return false;
        return (t1.val==t2.val)&&isSame(t1.left,t2.right)&&isSame(t1.right,t2.left);
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
