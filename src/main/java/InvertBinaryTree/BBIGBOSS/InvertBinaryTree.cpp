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

    TreeNode* invertTree(TreeNode* root)
    {
        if (root)
        {
            swap(root->left, root->right);

            invertTree(root->left);
            invertTree(root->right);
        }

        return root;
    }
};