package MaximumDepthOfBinaryTree.mly;



public class Solution {
    public int maxDepth(TreeNode root) {
        return height(root);
    }

    public int height(TreeNode root){
        if (root==null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        return  (left>right ? left:right)+1;

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
