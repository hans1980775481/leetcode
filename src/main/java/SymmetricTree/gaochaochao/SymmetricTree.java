package SymmetricTree.gaochaochao;

import java.util.LinkedList;
import java.util.Queue;


/**
* @author gaochaochao
* @date 2019年6月17日 下午6:26:58
* @description 二叉树镜像判断
*/
public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
        //空树或者只有根节点的二叉树，返回true
        if(root==null || (root.left==null && root.right==null)){
            return true;
        }
        
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode node1=queue.poll();
            TreeNode node2=queue.poll();
            if(node1==null && node2==null){
                continue;
            }
            if(node1==null || node2==null){
                return false;
            }
            if(node1.val!=node2.val){
                return false;
            }
            queue.offer(node1.left);
            queue.offer(node2.right);
            queue.offer(node1.right);
            queue.offer(node2.left);
        }
        return true;
    }
}

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

   public TreeNode() {
   }
}

