package MaximumDepthOfBinaryTree.liuzhiqiang;

public class MaxDepthTree {
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftheight = maxDepth(root.left);
        int rightheight = maxDepth(root.right);

        return (leftheight > rightheight) ? leftheight + 1 : rightheight + 1;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
