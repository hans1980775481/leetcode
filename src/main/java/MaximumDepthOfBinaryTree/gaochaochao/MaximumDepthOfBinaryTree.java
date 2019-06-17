package MaximumDepthOfBinaryTree.gaochaochao;

import java.util.LinkedList;
import java.util.Queue;

/**
* @author gaochaochao
* @date 2019年6月17日 下午5:19:25
* @description 二叉树的最大高度  按照  只有一个根节点二叉树高度为1为准计算
*/
public class MaximumDepthOfBinaryTree {
	//递归方法 ，如果该节点不为null 则取该节点左右子树的最大值+1作为该节点处的高度
	public int maxDepth(TreeNode root) {
        if(root!=null){
            return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
        }
        return 0;
    }
    //非递归方法 借助队列实现 ，需要注意的是，应该添加辅助变量记录二叉树的每一层，直到遍历完最后一层，即可得出高度
    public int maxDepth02(TreeNode root) {
        int maxDepth=0;
        if(root==null){
            return maxDepth;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        TreeNode node=null;
        TreeNode lastNode=root; //记录当前层的最后一个节点
        TreeNode nlastNode=root; //记录当前层下一层的最后一个节点
        while(!queue.isEmpty()){
            node=queue.poll();
            //保证添加入队列的节点都不是null（null节点没有孩子节点，其下一层孩子为null，所以不需要加入队列）
            //注意是两个if，当前节点的左孩子，和右孩子分别判断是否为null，作相同处理，切记写成 if ... else ，二者不是转折关系
            if(node.left!=null){
                queue.offer(node.left);
                nlastNode=node.left; //动态更新下一层最后一个节点的指向
            }
            if(node.right!=null){
                queue.offer(node.right);
                nlastNode=node.right;
            }
            //每	次都要将当前节点和当前层最后一个节点作比较，判断是否当前层遍历完成
            if(node==lastNode){
                maxDepth++; //遍历完一层，高度加1
                lastNode=nlastNode; //同时更新lastNode的值，指向下一层最后一个
            }
        }
        return maxDepth;
    }
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}
