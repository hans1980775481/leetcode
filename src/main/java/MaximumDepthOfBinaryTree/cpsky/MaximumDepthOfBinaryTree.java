package MaximumDepthOfBinaryTree.cpsky;

/**
 * \* User: sky
 * \* Date: 2019/6/11
 * \* Time: 16:04
 * \* Description:Given a binary tree, find its maximum depth.
 * <p>
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * \
 */


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.left = new TreeNode(3);
        System.out.println(maxDepth(treeNode));
    }
    public static int maxDepth(TreeNode root) {
        if (root  == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return left >= right ? left + 1 : right + 1;
    }
}