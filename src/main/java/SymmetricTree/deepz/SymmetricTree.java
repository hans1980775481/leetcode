package SymmetricTree.deepz;

/**
 * @author DeepSleeping
 * @date 2019/6/21 09:41
 * @description 判断树是否为对称的
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Symmetric Tree.
 * Memory Usage: 38 MB, less than 84.53% of Java online submissions for Symmetric Tree.
 * <p>
 * <p>
 * 通过复制一份树，然后再对称比较，学到了..
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {

        return isMirror(root, root);
    }

    /**
     * @description 判断是否为镜像
     * @author DeepSleeping
     * @date 2019/6/21 10:04
     */
    private boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        }
        if (t1 == null || t2 == null) {
            return false;
        }
        return t1.val == t2.val && isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
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
