package MaximumDepthOfBinaryTree.wally;


public class MaxDepth {
    public int maxDepth(TreeNode root){
        return root == null ? 0 : Math.max(maxDepth(root.left),maxDepth(root.right));
    }

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        };
    }
}
