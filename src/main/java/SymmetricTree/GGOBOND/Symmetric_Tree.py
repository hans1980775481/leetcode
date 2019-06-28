# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def isSymmetric(self, root: TreeNode) -> bool:

        ''' my 2128ms 155.4MB '''
        lst = []
        i = 0
        isSymmetric_check = True
        while 1:
            if i == 0:
                lst.append(root)
            if i != 0:
                res = []
                res_tree = []
                for cur_root in lst:
                    if cur_root != None and cur_root.left:
                        res.append(cur_root.left.val)
                        res_tree.append(cur_root.left)
                    else:
                        res.append('None')
                        res_tree.append(None)

                    if cur_root != None and cur_root.right:
                        res.append(cur_root.right.val)
                        res_tree.append(cur_root.right)
                    else:
                        res.append('None')
                        res_tree.append(None)

                if res != res[::-1]:
                    isSymmetric_check = False
                    return isSymmetric_check

                if res.count('None') == len(res):
                    return isSymmetric_check

                lst = res_tree
            i += 1


''' other --> 52ms 13.3MB '''
        # queue = [root]
        #
        # while(queue):
        #     next_queue = list()
        #     layer = list()
        #     for node in queue:
        #         if not node:
        #             layer.append(None)
        #             continue
        #         next_queue.append(node.left)
        #         next_queue.append(node.right)
        #
        #         layer.append(node.val)
        #
        #     if layer != layer[::-1]:
        #         return False
        #     queue = next_queue
        #
        # return True


''' recursive '''
# def check(node1, node2):
#     if not node1 and not node2:
#         return True
#     elif not node1 or not node2:
#         return False
#
#     if node1.val != node2.val:
#         return False
#     return check(node1.left, node2.right) and check(node1.right, node2.left)


return check(root, root)
