package InvertBinaryTree.XMHans;

public class InvertBinaryTree {
    private TreeNode temp;

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;
        reverseTree(root);
        return root;
    }
    public void reverseTree(TreeNode root) {
        if (root != null) {
            reverseTree(root.left);
            reverseTree(root.right);
            temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
    }
}
// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
