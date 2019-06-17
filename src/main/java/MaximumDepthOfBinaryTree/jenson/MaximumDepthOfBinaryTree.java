package MaximumDepthOfBinaryTree.jenson;

/**
 * @author: zhousong
 * @data: 2019/6/17
 */
public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = maxDepth(root.left) + 1;
        int rightDepth = maxDepth(root.right) + 1;

        return leftDepth > rightDepth ? leftDepth : rightDepth;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
