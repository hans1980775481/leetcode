package SymmetricTree.LiuMingHao;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SymmetricTree {
    List list = new ArrayList();
    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    public boolean isSymmetric(TreeNode root) {
        //按层遍历将数据存入到list中
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            if(temp!=null) {
                list.add(temp.val);
                if(temp.left !=null || temp.right != null) {
                    queue.add(temp.left);
                    queue.add(temp.right);
                }
            }else{
                list.add(null);
            }
        }
        //根据list 来判断是否为镜像树
        for(int i=1;i<list.size();){
            List temp = new ArrayList();
            //将list 分组 分成 1,2,4,8,16
            temp.addAll(list.subList(i-1,(i-1)*2+1));
            for(int j=0;j<temp.size()/2;j++){
                if(temp.get(j)!= temp.get(temp.size()-1-j)){
                    return false;
                }
            }
            i *= 2;
        }
        return true;
    }

    public static void main(String[] args) {
        SymmetricTree symmetricTree = new SymmetricTree();
        TreeNode t = new TreeNode(1);
        TreeNode t2_1 = new TreeNode(2);
        TreeNode t2_2 = new TreeNode(2);
        TreeNode t3_1 = new TreeNode(3);
        TreeNode t3_2 = new TreeNode(2);
        TreeNode t3_3 = new TreeNode(2);
        TreeNode t3_4 = new TreeNode(3);
        t.left=t2_1;
        t.right=t2_2;
        t2_1.left=t3_1;
        t2_1.right=t3_2;
        t2_2.left=t3_3;
        t2_2.right=t3_4;
        System.out.println(symmetricTree.isSymmetric(t));
    }
}
