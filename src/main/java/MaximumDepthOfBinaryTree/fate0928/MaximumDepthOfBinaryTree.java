package MaximumDepthOfBinaryTree.fate028;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class MaximumDepthOfBinaryTree {
    /**
     * 递归的获取二叉树的最大深度
     * 只要子节点不为null就+1
     * @param root
     * @return
     */
	public int maxDepth(TreeNode root) {
		if(root==null )
		{
			return 0;
		}else{
			return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
		}
        
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode[] treeNode = {new TreeNode(3),new TreeNode(9),new TreeNode(20),new TreeNode(15),new TreeNode(7)};
		treeNode[0].left = treeNode[1];
		treeNode[0].right = treeNode[2];
		treeNode[2].left = treeNode[3];
		treeNode[2].right = treeNode[4];
		MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();
		System.out.println(maximumDepthOfBinaryTree.maxDepth(treeNode[0]));
	}

}
