package MaximumDepthOfBinaryTree.weiyien;

/**
 * @auther: 魏薏恩
 * @date: 2019/6/20 16:48
 * @description: 树最大深度
 * @tag: 二叉树 递归
 */
public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftDepth = maxDepth(root.left) + 1;
            int rightDepth = maxDepth(root.right) + 1;
            return leftDepth > rightDepth ? leftDepth : rightDepth;
        }

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
