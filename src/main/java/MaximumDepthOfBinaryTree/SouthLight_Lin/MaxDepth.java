package MaximumDepthOfBinaryTree.SouthLight_Lin;

/**
 * 二叉树的最大路径
 * 输入：
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * 输出：3
 * @author SouthLight-Lin on 2019/7/6
 */
public class MaxDepth {
    public int maxDepth(TreeNode root) {
        /**
         * 思路：深度遍历，通过抑制遍历左右子节点，计算深度
         */
        return dfs(root, 0);
    }

    private int dfs(TreeNode root, int max) {
        if (root == null){
            return max;
        }
        max++;
        int leftMax = dfs(root.left, max);
        int rightMax = dfs(root.right, max);
        return leftMax>=rightMax?leftMax:rightMax;
    }

    public static void main(String[] args) {
        TreeNode node3 = new TreeNode(3);
        TreeNode node9 = new TreeNode(9);
        TreeNode node20 = new TreeNode(20);
        TreeNode node15 = new TreeNode(15);
        TreeNode node7 = new TreeNode(7);
        node20.left=node15; node20.right=node7;
        node3.left=node9; node3.right=null;
        MaxDepth maxDepth = new MaxDepth();
        System.out.println(maxDepth.maxDepth(node3));
    }

}
