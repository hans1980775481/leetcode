package SymmetricTree.cpsky;

/**
 * \* Author: sky
 * \* Date: 2019/6/12
 * \* Description:
 * \
 */
class TreeNode {
    Integer val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
    TreeNode() {
        val = null;
    }
    TreeNode createBinaryTreeByArray(int []array,int index)
    {
        TreeNode tn = null;
        if (index<array.length) {
            if (array[index] != -1){
                int value = array[index];
                tn = new TreeNode(value);
                tn.left = createBinaryTreeByArray(array, 2*index+1);
                tn.right = createBinaryTreeByArray(array, 2*index+2);}
        }
        return tn;
    }

}
public class SymmetricTree {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,-1,2};
        TreeNode tree = new TreeNode();
        TreeNode root = tree.createBinaryTreeByArray(arr, 0);
        System.out.println(isMirror(root,root));

    }
    public static boolean isTrue(TreeNode root){
        return isMirror(root, root);
    }
    public static boolean isMirror(TreeNode left, TreeNode right) {
        if ((left != null) && (right == null)) {
            return false;
        }
        if ((left == null) && (right != null)) {
            return false;
        }
        if ((left == null) && (right == null)) {
            return true;
        }
        return left.val == right.val && isMirror(left.right, right.left) && isMirror(left.left,right.right);
    }
}