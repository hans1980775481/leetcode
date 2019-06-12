package SymmetricTree.wangyuhuich;
/**
 * 执行用时 :2 ms, 在所有Java提交中击败了87.21%的用户
 * 内存消耗 :34.6 MB, 在所有Java提交中击败了87.37%的用户
 */

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isEqual(root.left, root.right);
    }

    public boolean isEqual(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if (left != null && right != null) {
            if (left.val == right.val) {
                return isEqual(left.left, right.right) && isEqual(left.right, right.left);
            }else{
                return false;
            }
        } else {
            return false;
        }
    }


    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode t1 = new TreeNode(2);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(4);
        TreeNode t6 = new TreeNode(3);

        root.left = t1;
        root.right = t2;
        t1.left = t3;
        t1.right = t4;
        t2.right = t5;
        t3.right = t6;

        new SymmetricTree().isSymmetric(root);
    }
}
