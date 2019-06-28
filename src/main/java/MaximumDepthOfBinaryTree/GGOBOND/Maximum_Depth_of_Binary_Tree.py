# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def maxDepth(self, root: TreeNode) -> int:
        if root == None:
            return 0

        depth = 0
        queue = [root]
        while len(queue) != 0:  # 遍历根节点的所有子树，如果有子树，则将子树放进列表queue中，然后删除根节点，再将子树作为根节点，循环往复。
            depth += 1
            for i in range(0, len(queue)):
                if queue[0].left:
                    queue.append(queue[0].left)
                if queue[0].right:
                    queue.append(queue[0].right)
                del queue[0]
        return depth