package ConvertBSTToGreaterTree.wally;

public class ConvertBSTToGreaterTree {
    private int sum;
    public TreeNode convertBST(TreeNode root) {
        if (root != null){
            convertBST(root.right);
            sum+= root.val;
            root.val = sum;
            convertBST(root.left);
        }
        return root;
    }
    static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
