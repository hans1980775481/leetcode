package ConvertBSTToGreaterTree.AzusaMutan;

class Solution {
    public int preNum = 0;

    public TreeNode convertBST(TreeNode root) {
        unPreOrder(root);
        return root;
    }
    public void unPreOrder(TreeNode root){
        if(root == null)
            return;
        unPreOrder(root.right);
        root.val += preNum;
        preNum = root.val;
        unPreOrder(root.left);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
