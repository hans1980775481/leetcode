//
// Created by BBIGBOSS on 2019-06-15.
//

/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution
{
    public:

    bool isSymmetric(TreeNode* root)
    {
        if (!root) return true;

        return isSymmetric(root->left, root->right);
    }

    bool isSymmetric(TreeNode* left, TreeNode* right)
    {
        if (!left && !right)
            return true;
        else if (!left && right)
            return false;
        else if (left && !right)
            return false;
        else if (left->val != right->val)
            return false;
        else
            return isSymmetric(left->left, right->right) && isSymmetric(left->right, right->left);
    }
};