package InvertBinaryTree.AzusaMutan;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;
        return f(root);
    }

    public TreeNode f (TreeNode node) {
        if (node == null) {
            return null;
        }
        TreeNode temp;
        temp = f(node.left);
        node.left = f(node.right);
        node.right = temp;

        return node;
    }
}
