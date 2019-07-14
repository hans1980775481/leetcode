/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */

func convertBST(root *TreeNode) *TreeNode {
    sumNodeBST(root,0)
    return root
}

func sumNodeBST(root *TreeNode, sum int) int{
    if root != nil {
        sum = sumNodeBST(root.Right,sum)
        root.Val += sum
        sum = root.Val
        sum = sumNodeBST(root.Left,sum)
    }
    return sum
}
