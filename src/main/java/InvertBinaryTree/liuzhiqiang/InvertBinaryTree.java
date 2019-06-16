package InvertBinaryTree.liuzhiqiang;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        // 递归结束的条件
        if(root == null) {
            return root;
        }

        // 交换(子树)左右孩子
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        // 开始递归
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
