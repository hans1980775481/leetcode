/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int max = 0;
            int tmp = maxDepth(root.left);
            if(tmp>max){
                max=tmp;
            }
            tmp = maxDepth(root.right);
            if(tmp>max){
                max=tmp;
            }
            return max+=1;
        }
    }
}