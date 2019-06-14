package MaximumDepthOfBinaryTree.Zntao;


public class MaximumDepthofBinaryTree {

    // 第一种：用递归的思路，二叉树的最大路径等于左子树和右子树的深度 + 1
    // 执行用时 :
    //1 ms
    //, 在所有Java提交中击败了
    //95.34%
    //的用户
    //内存消耗 :
    //37.6 MB
    //, 在所有Java提交中击败了
    //41.76%
    //的用户
    public int maxDepth(TreeNode root) {

        if (null == root) {
            return 0;
        }

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
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
