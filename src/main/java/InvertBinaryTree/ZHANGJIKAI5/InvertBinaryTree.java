package InvertBinaryTree.ZHANGJIKAI5;

/**
 * author：ZHANGJIKAI5
 * 题目：226. Invert Binary Tree
 * 解题思路：递归交换左右子树，
 * 时间复杂度和空间复杂度太高，还没想好解决办法
 */
public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        if (null == root) {
            return null;
        }
        TreeNode invertRoot = new TreeNode(root.val);
        invertRoot.right = invertTree(root.left);
        invertRoot.left = invertTree(root.right);
        return invertRoot;

        /*TreeNode right = root.right;
        root.right = invertTree(root.left);
        root.left = invertTree(right);
        return root;*/

    }

}
