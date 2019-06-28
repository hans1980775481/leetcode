package InvertBinaryTree.deepz;

/**
 * @author DeepSleeping
 * @date 2019/6/19 17:10
 * @description 翻转二叉树
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Invert Binary Tree.
 * Memory Usage: 34.2 MB, less than 100.00% of Java online submissions for Invert Binary Tree.
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {

        if (root == null){
            return null;
        }

        TreeNode treeNode = new TreeNode(root.val);
        treeNode.left = invertTree(root.right);
        treeNode.right = invertTree(root.left);

        return treeNode;
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
