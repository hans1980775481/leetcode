package InvertBinaryTree.jiucheng;

public class invertTree {
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        TreeNode a=root.left;
        root.left=root.right;
        root.right=a;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
