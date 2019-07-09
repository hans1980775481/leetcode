package SymmetricTree.SouthLight_Lin;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 判断一颗二叉树是不是镜像树
 * 输入：
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * 输出：true
 *
 * 输入：
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 * 输出：false
 * @author SouthLight-Lin on 2019/7/6
 */
public class IsSymmetric {
    /**
     * 层次遍历
     * 一层的遍历所有元素
     * 然后判断每一层的数据是不是镜像数据
     */
    public boolean isSymmetric(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        return bfs(queue, 0);
    }


    boolean bfs(Queue<TreeNode> queue, int level){
        // 通过当前的层次决定从queue中取出多少个数
        int num = (int) Math.pow(2.0, level);
        ArrayList<TreeNode> arr = new ArrayList<>();
        // 记录下一层是否全是null
        boolean flag = false;
        for (int i = 0; i < num; i++) {
            TreeNode node = queue.poll();
            if (node!=null){
                queue.add(node.left);queue.add(node.right);
                flag = node.left==null&&node.right==null?false:true;
            }
            else {
                queue.add(null);queue.add(null);
            }
//            System.out.print(node==null?"null ":node.val + " ");
            arr.add(node);
        }
//        System.out.println();
        // 判断当前层是否为镜像
        int l=0, r=arr.size()-1;
        while (l<r){
            TreeNode lNode = arr.get(l);
            TreeNode rNode = arr.get(r);
            if ((lNode==null && rNode!=null) || (lNode!=null && rNode==null)){
                return false;
            }
            else if (lNode==rNode || lNode.val == rNode.val){
                l++;r--;
            }
            else {
                return false;
            }
        }

        return flag?bfs(queue, level+1):true;
    }


    /**
     * 网上答案
     */
    public boolean isSymmetric2(TreeNode root) {
        // 使用一个队列
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(root);
        /**
         * 关键思想在于有两棵树，
         * 该树的左节点等于右节点
         * 然后将当前节点左节点，另一个节点的右节点入队列
         */
        while (!q.isEmpty()) {
            TreeNode t1 = q.poll();
            TreeNode t2 = q.poll();
            if (t1 == null && t2 == null) continue;
            if (t1 == null || t2 == null) return false;
            if (t1.val != t2.val) return false;
            q.add(t1.left);
            q.add(t2.right);
            q.add(t1.right);
            q.add(t2.left);
        }
        return true;
    }

    /**
     * 网上方法三
     * 关键也是比较两棵树
     * 树的左子节点等于右子节点
     * 然后继续递归比较
     */
    public boolean isSymmetric3(TreeNode root) {
        return isMirror(root, root);
    }

    private boolean isMirror(TreeNode r1, TreeNode r2) {
        if (r1==null && r2==null) return true;
        if (r1==null || r2==null) return false;
        return (r1.val==r2.val) && isMirror(r1.left, r2.right) && isMirror(r1.right, r2.left);
    }


    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(2);
//        TreeNode node4 = new TreeNode(null);
        TreeNode node5 = new TreeNode(3);
        TreeNode node6 = new TreeNode(3);
        node3.left = node6;
        node2.left = null;node2.right = node5;
        node1.left = node2;node1.right = node3;

        IsSymmetric isSymmetric = new IsSymmetric();
        System.out.println(isSymmetric.isSymmetric3(node1));
    }

}
