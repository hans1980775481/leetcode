package InvertBinaryTree.fate0928;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class InvertBinaryTree {
	
	/**
	*递归的交换每个节点的左右节点
	*/
	public TreeNode invertTree(TreeNode root) {
		if(root == null ) {
			return null;
		}else{
			TreeNode rightTreeNode =  root.right;
			root.right = invertTree(root.left);
			root.left = invertTree(rightTreeNode);
			return root;
		}
    }
	
	 // 先序遍历递归   
    public void preOrder(TreeNode t) {  
        if (t == null) {  
            return;  
        }  
        System.out.print(t.val);  
        preOrder(t.left);  
        preOrder(t.right);  
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode[] treeNode = {new TreeNode(4),new TreeNode(2),new TreeNode(7),new TreeNode(1),new TreeNode(3),new TreeNode(6),new TreeNode(9)};
		treeNode[0].left = treeNode[1];
		treeNode[0].right = treeNode[2];
		treeNode[1].left = treeNode[3];
		treeNode[1].right = treeNode[4];
		treeNode[2].left = treeNode[5];
		treeNode[2].right = treeNode[6];
		InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
		invertBinaryTree.preOrder(treeNode[0]);
		invertBinaryTree.invertTree(treeNode[0]);
		System.out.println();  
		invertBinaryTree.preOrder(treeNode[0]);
	}

}
