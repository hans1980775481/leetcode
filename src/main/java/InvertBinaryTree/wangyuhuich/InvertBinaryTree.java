package InvertBinaryTree.wangyuhuich;
/**
 * 执行用时 :1 ms, 在所有Java提交中击败了69.43%的用户
 * 内存消耗 :33.7 MB, 在所有Java提交中击败了61.97%的用户
 */


public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        TreeNode temp = null;
        image(root, temp);
        return root;
    }

    public void image(TreeNode root, TreeNode middle) {
        if (root != null) {
            if (root.left != null && root.right != null) {
                middle = root.left;
                root.left = root.right;
                root.right = middle;
                invertTree(root.left);
                invertTree(root.right);

            } else if (root.left != null) {
                root.right = root.left;
                root.left = null;
                invertTree(root.right);
            } else if (root.right != null) {

                root.left = root.right;
                root.right = null;
                invertTree(root.left);
            }
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
