package InvertBinaryTree.tenYearsIn;

/**
 * Created With Intellij IDEA
 * @auth MaChao
 * @time 2019-06-24 11:57
 * @Description 旋转二叉树
 */
public class Solution {


    public static TreeNode invertTree(TreeNode root){
        // 判断是否有子结构
        if( root.left!= null ){
            TreeNode leftChild = root.left;
            TreeNode rightChild = root.right;
            // invert tree
            TreeNode temp;
            temp = leftChild;
            leftChild = rightChild;
            rightChild = temp;
            root.left = leftChild;
            root.right = rightChild;
            invertTree(leftChild);
            invertTree(rightChild);
        }
        return root;
    }

        /**
         * tree construction
         */
        static class TreeNode{

            public int val;

            public TreeNode left;

            public TreeNode right;

            public TreeNode(int val){
                this.val = val;
            }
        }
}
