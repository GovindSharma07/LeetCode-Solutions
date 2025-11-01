# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def isSymmetric(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: bool
        """
        if not  root:
            return True

        def mirror(left,right):
            if left == None and right == None:
                return True
            if left == None or right == None:
                return False
            return (left.val == right.val) and mirror(left.right,right.left) and mirror(left.left,right.right)
        
        return mirror(root.left,root.right)
        