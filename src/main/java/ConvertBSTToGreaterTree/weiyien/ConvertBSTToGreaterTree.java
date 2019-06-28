package ConvertBSTToGreaterTree.weiyien;

/**
 * @auther: 魏薏恩
 * @date: 2019/6/26 09:09
 * @description:
 */
public class ConvertBSTToGreaterTree {
    int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.right != null) {
            root.right = convertBST(root.right);
        }
        sum += root.val;
        root.val = sum;
        if (root.left != null) {
            root.left = convertBST(root.left);
        }
        return root;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
