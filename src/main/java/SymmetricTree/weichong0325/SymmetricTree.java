package SymmetricTree.weichong0325;

/**
 * @author weichong0325 on 2019/6/20
 * LeetCode-101：对称二叉树
 * 解题思路：递归
 * 这种解法比较好理解，判断该树的根节点是否一致，左右子树是否镜像对称
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root,root);
    }
    public boolean isMirror(TreeNode t1,TreeNode t2){
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        return  (t1.val == t2.val) && isMirror(t1.left,t2.right) && isMirror(t1.right,t2.left);
    }
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
}
