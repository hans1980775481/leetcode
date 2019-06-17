package SymmetricTree.ZHANGJIKAI5;

/**
 * author：ZHANGJIKAI5
 * 题目：101. Symmetric Tree
 * 解题思路：先验证根节点是否为空，为空返回true，
 *           然后验证根节点的左右子树是否为空，都为空返回true，某个为空返回false，都不为空时继续执行，
 *           将左子树的左节点和右子树的右节点组成新的二叉树，递归执行，
 *           将左子树的右节点和右子树的左节点组成新的二叉树，递归执行，
 *           返回最终结果
 * ps：时间复杂度有点高，空间复杂度还可以，需要优化
 *     一个思路，两种代码写法，第二种更简洁。
 */
public class SymmetricTree {

    /**
     * 第一次执行：
     * 执行用时 :2 ms, 在所有Java提交中击败了86.60%的用户
     * 内存消耗 :34.1 MB, 在所有Java提交中击败了98.85%的用户
     */
    public boolean isSymmetric(TreeNode root) {
        if (null == root) {
            return true;
        }
        if  (null == root.left && null == root.right) {
            return true;
        }
        if  (null == root.left || null == root.right) {
            return false;
        }
        if (root.left.val != root.right.val) {
            return false;
        }
        TreeNode subRoot = new TreeNode(root.left.val);
        subRoot.left = root.left.left;
        subRoot.right = root.right.right;
        boolean isSymmetric = isSymmetric(subRoot);
        if (isSymmetric) {
            subRoot.left = root.right.left;
            subRoot.right = root.left.right;
            isSymmetric = isSymmetric(subRoot);
        }
        return isSymmetric;
    }

    /**
     * 第二次执行：参考了别人的解答思路，把递归方法抽离出来，代码更简洁易读，但复杂度上没有特别明显的提升。
     * 执行用时 :2 ms, 在所有Java提交中击败了86.60%的用户
     * 内存消耗 :34.6 MB, 在所有Java提交中击败了89.14%的用户
     */
    public boolean isSymmetric_2(TreeNode root) {
        if (null == root) {
            return true;
        }
        return compare(root, root);
    }

    private boolean compare(TreeNode r1, TreeNode r2) {
        if (null == r1) {
            return null == r2;
        }
        if (null == r2) {
            return false;
        }
        if (r1.val == r2.val) {
            return compare(r1.left, r2.right) && compare(r1.right, r2.left);
        }
        return false;
    }

}
