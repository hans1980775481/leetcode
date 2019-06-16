package InvertBinaryTree.cpsky;

/**
 * \* Author: sky
 * \* Date: 2019/6/13
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

    TreeNode createBinaryTreeByArray(int[] array, int index) {
        TreeNode tn = null;
        if (index < array.length) {
            if (array[index] != -1) {
                int value = array[index];
                tn = new TreeNode(value);
                tn.left = createBinaryTreeByArray(array, 2 * index + 1);
                tn.right = createBinaryTreeByArray(array, 2 * index + 2);
            }
        }
        return tn;
    }

}

public class InvertBinaryTree {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, -1, 5};
        TreeNode tree = new TreeNode();
        TreeNode root = tree.createBinaryTreeByArray(arr, 0);
        System.out.println(root.val);
        invert(root);
    }

    public static void invert(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode td = null;
        td = root.left;
        root.left = root.right;
        root.right = td;
        invert(root.left);
        invert(root.right);
    }

    private static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        root.left = right;
        root.right = left;
        return root;
    }
}