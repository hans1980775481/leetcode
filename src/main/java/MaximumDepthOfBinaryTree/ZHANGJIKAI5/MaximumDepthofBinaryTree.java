package MaximumDepthOfBinaryTree.ZHANGJIKAI5;

/**
 * author：ZHANGJIKAI5
 * 题目：104. Maximum Depth of Binary Tree
 * 解题思路：递归左右子树，分别获得左右子树的深度，然后比较返回最大深度。
 * 时间复杂度还可以，但空间复杂度较高，需要优化，在思考优化思路。
 */
public class MaximumDepthofBinaryTree {

    /**
     * 第一次执行结果：
     * 执行用时 : 1 ms, 在所有Java提交中击败了96.46%的用户
     * 内存消耗 : 35.8 MB在所有Java提交中击败了88.98%的用户
     */
    public int maxDepth(TreeNode root) {
        if (null == root) {
            return 0;
        }
        int leftDepth = 1;
        int rightDepth = 1;
        if (null != root.left) {
            leftDepth += maxDepth(root.left);
        }
        if (null != root.right) {
            rightDepth += maxDepth(root.right);
        }
        return leftDepth > rightDepth ? leftDepth : rightDepth;
    }

}
