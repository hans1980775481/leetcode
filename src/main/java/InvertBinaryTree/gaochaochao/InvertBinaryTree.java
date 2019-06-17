package InvertBinaryTree.gaochaochao;

import java.util.LinkedList;
import java.util.Queue;

/**
* @author gaochaochao
* @date 2019年6月17日 下午4:57:31
* @description 翻转二叉树   对二叉树的遍历操作过程添加其他操作
*/
public class InvertBinaryTree {
	//借助队列，非递归实现 在遍历二叉树时，不断交换左右孩子的值实现翻转
    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null) {
        	return root;
        }
        queue.offer(root); //存入二叉树根节点
        TreeNode node=null;
        while(!queue.isEmpty()){
            node=queue.poll(); //队列头部取出一个节点
            //如果节点不空
            if(node!=null){
            	//该节点的右孩子插入队尾，左孩子插入队尾，不管该节点的孩子节点是否为null，只是翻转插入队列中
                queue.offer(node.right); 
                queue.offer(node.left);
                //该节点的左右节点交换值
                TreeNode temp=node.left;
                node.left=node.right;
                node.right=temp;
            }
        }
        //返回根节点
        return root;
    }

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}
