#include <iostream>
#include <math.h>
#include <limits.h>
#include <string.h>
using namespace std;
struct TreeNode
{
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};
class Solution
{
public:
    TreeNode *invertTree(TreeNode *root)
    {
        if (root == NULL)
        {
            return NULL;
        }
        TreeNode *t1 = invertTree(root->left);
        TreeNode *t2 = invertTree(root->right);
        root->left = t2;
        root->right = t1;
        return root;
    }
};
int main()
{
    Solution s;
    system("pause");
    return 0;
}