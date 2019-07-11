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
    bool isSymmetric(TreeNode *root)
    {
        if (root == NULL)
            return true;
        TreeNode *t1 = root->left;
        TreeNode *t2 = root->right;
        return isSymmetric(t1, t2);
    }
    bool isSymmetric(TreeNode *t1, TreeNode *t2)
    {
        if (t1 == NULL && t2 == NULL)
            return true;
        if (t1 != NULL && t2 == NULL)
            return false;
        if (t1 == NULL && t2 != NULL)
            return false;
        if (t1->val == t2->val)
        {
            if (isSymmetric(t1->left, t2->right))
            {
                if (isSymmetric(t2->left, t1->right))
                    return true;
            }
        }
        return false;
    }
};
int main()
{
    Solution s;
    system("pause");
    return 0;
}