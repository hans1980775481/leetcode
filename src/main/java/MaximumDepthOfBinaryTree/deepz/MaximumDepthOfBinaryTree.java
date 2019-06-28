package MaximumDepthOfBinaryTree.deepz;

/**
 * @author DeepSleeping
 * @date 2019/6/21 09:23
 * @description 求树的深度
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Depth of Binary Tree.
 * Memory Usage: 38.8 MB, less than 97.39% of Java online submissions for Maximum Depth of Binary Tree.
 *
 * 感觉很开心，通过练习，对递归和数有了点感觉，虽然是easy题，但是至少拿道题目有思路并且能写代码了。看到ac很高兴
 */
public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int depth = 1;
        depth += Math.max(maxDepth(root.left), maxDepth(root.right));

        return depth;
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

