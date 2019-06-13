package MaximumDepthOfBinaryTree.CodeLove;

/**
 * 深度二叉树
 */
public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        //当二叉树为空的时候 直接返回0
        if (root==null){
            return 0;
        }
        if(root.left==null){
            return maxDepth(root.right)+1;
        }
        if(root.right==null){
            return maxDepth(root.left)+1;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        this.val=x;
    }
}
