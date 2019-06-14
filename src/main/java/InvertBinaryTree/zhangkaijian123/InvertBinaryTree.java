package zhangkaijian123;

/**
 * @author 张铠建
 * @description 镜像二叉树
 * @createdate 2019-06-14 10:06
 **/
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
