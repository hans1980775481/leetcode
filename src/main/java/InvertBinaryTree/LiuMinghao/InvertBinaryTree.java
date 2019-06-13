package InvertBinaryTree.LiuMinghao;

import javax.xml.transform.Result;

public class InvertBinaryTree {

    public TreeNode InvertBinaryTree(TreeNode treeNode) {
        if (treeNode == null)
            return null;
        reversalTree(treeNode);
        return treeNode;
    }

    public void reversalTree(TreeNode treeNode) {
        if (treeNode != null) {

            reversalTree(treeNode.left);
            reversalTree(treeNode.right);
            TreeNode temp;
            temp = treeNode.left;
            treeNode.left = treeNode.right;
            treeNode.right = temp;
        }
    }

}

// Definition for a binary tree node.
