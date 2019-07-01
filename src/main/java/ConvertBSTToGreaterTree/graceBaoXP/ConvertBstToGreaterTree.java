package ConvertBSTToGreaterTree.graceBaoXP;


/**
 * Given a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original
 * BST is changed to the original key plus sum of all keys greater than the original key in BST.
 *
 * Input: The root of a Binary Search Tree like this:
 *               5
 *             /   \
 *            2     13
 *
 * Output: The root of a Greater Tree like this:
 *              18
 *             /   \
 *           20     13
 */
public class ConvertBstToGreaterTree {

    private int sum=0;

    public TreeNode convertBST(TreeNode root) {
        if(root!=null){
            convertBST(root.right);
            sum+= root.val;
            root.val=sum;
            convertBST(root.left);
        }
        return root;
    }
}

class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;

         public TreeNode() {
         }

        TreeNode(int x) { val = x; }
}
