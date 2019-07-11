package InvertBinaryTree.SouthLight_Lin;


/**
 * 反转二叉树
 * 输入：
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * 输出：
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 *
 * @author SouthLight-Lin on 2019/7/5
 */
public class InvertTree {
    /**
     * 思路：
     *      深度搜索，相当于层次遍历，从叶节点开始更换两个节点
     */


    public TreeNode invertTree(TreeNode root) {
        if (root == null || (root.left==null && root.right==null))
            return root;
        dfs(root);
        return root;
    }

    private void dfs(TreeNode root) {
        if (root.left==null && root.right==null){
            return;
        }
        else if (root.left!=null && root.right==null){
            dfs(root.left);
        }
        else if (root.left==null && root.right!=null){
            dfs(root.right);
        }else{
            dfs(root.left); dfs(root.right);
        }
        TreeNode tmp = root.right;
        root.right = root.left;
        root.left = tmp;
    }

    public static void main(String[] args) {
        InvertTree invertTree = new InvertTree();
        TreeNode root4 = new TreeNode(4);
        TreeNode root2 = new TreeNode(2);
        TreeNode root7 = new TreeNode(7);
        TreeNode root1 = new TreeNode(1);
        TreeNode root3 = new TreeNode(3);
        TreeNode root6 = new TreeNode(6);
        TreeNode root9 = new TreeNode(9);
//        root2.left = root1; root2.right = root3;
//        root7.left = root6; root7.right = root9;
//        root4.left = root2; root4.right = root7;
        root4.left = root2;
        invertTree.invertTree(root4);
    }
}
