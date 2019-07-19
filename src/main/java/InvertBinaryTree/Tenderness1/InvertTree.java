package InvertBinaryTree.Tenderness1;

public class InvertTree {
    public TreeNode invertTree(TreeNode root){
        if (root==null){
            return null;

        }
        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        root.right=right;
        root.left=left;
        return root;

    }
}
