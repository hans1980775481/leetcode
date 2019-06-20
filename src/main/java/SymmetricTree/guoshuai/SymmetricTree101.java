package test;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
 *  执行用时 :2 ms, 在所有 Java 提交中击败了86.28%的用户
	内存消耗 :34.4 MB, 在所有 Java 提交中击败了92.46%的用户
 */

public class SymmetricTree101 {
	public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
	public boolean isSymmetric(TreeNode root) {
	    if(root == null) return true;
	    return isSymmetric(root.left, root.right);
	}

	private boolean isSymmetric(TreeNode t1, TreeNode t2){
	    if(t1 == null && t2 == null) return true;
	    if(t1 == null || t2 == null) return false;
	    if(t1.val != t2.val) return false;
	    return isSymmetric(t1.left, t2.right) && isSymmetric(t1.right, t2.left);
	}    
}