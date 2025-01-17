package MaximumDepthOfBinaryTree.graceBaoXP;

import java.util.LinkedList;

/**
 * Given a binary tree, find its maximum depth.
 *
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 * Note: A leaf is a node with no children.
 *
 * Example:
 *
 * Given binary tree [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its depth = 3.
 */
public class MaximumDepthofBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root==null){
            return 0;
        }

        int num=0;
        LinkedList<TreeNode> linkedList=new LinkedList();
        linkedList.add(root);
        while (!linkedList.isEmpty()){
            int size=linkedList.size();
            while (size>0){
                TreeNode cur=linkedList.poll();
                if (cur.left!=null){
                    linkedList.add(cur.left);
                }
                if (cur.right!=null){
                    linkedList.add(cur.right);
                }
                size--;
            }
            num++;
        }
        return num;
    }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}


