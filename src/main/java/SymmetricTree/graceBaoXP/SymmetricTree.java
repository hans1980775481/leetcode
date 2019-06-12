package SymmetricTree.graceBaoXP;

import java.util.LinkedList;

/**
 *Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 *
 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
 */
public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        LinkedList<TreeNode> linkedList=new LinkedList<>();
        linkedList.add(root);
        linkedList.add(root);

        while (!linkedList.isEmpty()){
            TreeNode treeNode1=linkedList.poll();
            TreeNode treeNode2=linkedList.poll();
            if (treeNode1==null&&treeNode2==null){
                continue;
            }
            if (treeNode1==null||treeNode2==null){
                return false;
            }
            if (treeNode1.val!=treeNode2.val){
                return false;
            }
            linkedList.add(treeNode1.left);
            linkedList.add(treeNode2.right);
            linkedList.add(treeNode1.right);
            linkedList.add(treeNode2.left);
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
