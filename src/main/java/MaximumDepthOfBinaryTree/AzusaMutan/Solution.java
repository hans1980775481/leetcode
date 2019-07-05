package MaximumDepthOfBinaryTree.AzusaMutan;

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return f(root);
    }

    public int f (TreeNode node) {
        if (node.left == null && node.right == null) return 1;
        else if (node.left != null && node.right == null) return f(node.left)+1;
        else if (node.right != null && node.left == null) return f(node.right)+1;
        else return (bigger(f(node.left),f(node.right))+1);
    }

    public int bigger(int a, int b) {
        if(a > b) return a;
        else return b;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}


