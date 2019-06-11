package MaximumDepthOfBinaryTree.LiuMinghao;

public class MaximumDepthofBinaryTree {

    public int MaxDeep(TreeNode treeNode){

        if(treeNode == null) {
            return 0;
        }
        //递归求出最深的层数 每层递归+1 遇到子节点返回0
        return 1+MaxDeep(treeNode.left)>MaxDeep(treeNode.right)?MaxDeep(treeNode.left):MaxDeep(treeNode.right);
    }
}
