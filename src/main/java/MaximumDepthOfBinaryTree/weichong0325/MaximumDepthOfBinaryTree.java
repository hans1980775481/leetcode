package MaximumDepthOfBinaryTree.weichong0325;

/**
 * Create by weichong0325 on 2019/6/20
 * leetcode-104:二叉树的最大深度
 * 解题思路：
 * 判断结点是否存在，进行长度记录，递归调用
 */

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        int LD,RD;
        if (root == null){
            return 0;
        }
        LD = maxDepth(root.left);
        RD = maxDepth(root.right);
        return (LD>RD?LD:RD)+1;
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
