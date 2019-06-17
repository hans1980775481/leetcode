package SymmetricTree.LonlyBonze;

import java.util.ArrayList;

public class Solution {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        if (root != null) {
            ArrayList<TreeNode> list1 = new ArrayList<>();
            ArrayList<TreeNode> list2 = new ArrayList<>();
            list1.add(root.left);
            list2.add(root.right);
            traverseleft(list1);
            traverseright(list2);
            return listequals(list1, list2);
        } else {
            return true;
        }
    }

    public void traverseleft(ArrayList<TreeNode> list) {
        for (int i = 0; i < list.size(); i++) {
            TreeNode node = list.get(i);
            if (node != null) {
                list.add(node.left);
                list.add(node.right);
            }
        }
    }

    public void traverseright(ArrayList<TreeNode> list) {
        for (int i = 0; i < list.size(); i++) {
            TreeNode node = list.get(i);
            if (node != null) {
                list.add(node.right);
                list.add(node.left);
            }
        }
    }

    public boolean listequals(ArrayList<TreeNode> list1, ArrayList<TreeNode> list2) {
        if (list1.size() != list2.size())
            return false;
        else {
            for (int i = 0; i < list1.size(); i++) {
                TreeNode node1 = list1.get(i);
                TreeNode node2 = list2.get(i);
                if ((node1 == null && node2 != null) || (node1 != null && node2 == null)) {
                    return false;
                } else {
                    if (node1 != null && node1.val != node2.val) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
