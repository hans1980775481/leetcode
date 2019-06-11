package InvertBinaryTree.wangwangyuwan;

import SymmetricTree.wangwangyuwan.SymmetricTree;

public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        if(null != root) {

            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;

            invertTree(root.left);
            invertTree(root.right);
        }
        return root;

    }


    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
