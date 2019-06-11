package MaximumDepthOfBinaryTree.XMHans;

public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        return getMaxDepth(root,0);
    }
//    public int LMax = 0, RMax = 0;

    public int getMaxDepth(TreeNode root,int len) {
        if (root == null) return len;
        // LMax = getMaxDepth(root.left,len+1);
        // RMax = getMaxDepth(root.right,len+1); // 不能用里那是变量将这个结果存起来，因为在底柜的过程中这两个临时变量一直被赋值，一直在变会有BUG的
        return Math.max(getMaxDepth(root.left,len+1),getMaxDepth(root.right,len+1));
    }
}

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
