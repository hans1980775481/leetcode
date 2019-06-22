package InvertBinaryTree.Withme;

/***
 * add by jiaokc 20190620
 * 树的反转
 */
public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = root.right;
        TreeNode right = root.left;
        root.left = left;
        root.right = right;
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
