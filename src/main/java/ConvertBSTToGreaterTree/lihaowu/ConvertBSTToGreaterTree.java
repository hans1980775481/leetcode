package ConvertBSTToGreaterTree.lihaowu;

/**
 * @auther: Haowu Li
 * @date: 2019-07-01 23:16
 * @description:
 */
public class ConvertBSTToGreaterTree {

    private int sum = 0;

    public TreeNode convertBST(TreeNode node ){
        if (node != null) {
            convertBST(node.right);
            sum += node.val;
            node.val = sum;
            convertBST(node.left);
        }
        return node;
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