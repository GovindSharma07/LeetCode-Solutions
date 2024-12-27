class Solution {
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        if (root == null) return false

        // If we are at a leaf node, check if the targetSum equals the node value.
        if (root.left == null && root.right == null) {
            return targetSum == root.`val`
        }

        // Recur on left and right child with the updated targetSum
        return hasPathSum(root.left, targetSum - root.`val`) || hasPathSum(root.right, targetSum - root.`val`)
    }
}