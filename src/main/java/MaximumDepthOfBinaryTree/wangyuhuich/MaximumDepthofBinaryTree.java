package MaximumDepthOfBinaryTree.wangyuhuich;
/**
 * 执行用时 :1 ms, 在所有Java提交中击败了95.48%的用户
 * 内存消耗 :37.2 MB, 在所有Java提交中击败了50.65%的用户
 */

public class MaximumDepthofBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        }
    }


    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
