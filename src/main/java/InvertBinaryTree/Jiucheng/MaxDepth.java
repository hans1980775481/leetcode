package InvertBinaryTree.Jiucheng;

public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int a=0;
        int b=0;
        if(root.left!=null){
            a+=maxDepth(root.left)+1;
        }
        if(root.right!=null){
            b+= maxDepth(root.right)+1;
        }
        if(root.right==null&&root.left==null){
            a++;
            b++;
        }
        return a>=b?a:b;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
