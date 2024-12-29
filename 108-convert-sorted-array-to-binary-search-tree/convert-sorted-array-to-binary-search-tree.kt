/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun sortedArrayToBST(nums: IntArray): TreeNode? {
        if (nums.isEmpty()) return null

        val root = TreeNode(nums[nums.size/2])

        // Use sliceArray for array subranges
        root.left = sortedArrayToBST(nums.sliceArray(0 until nums.size/2))
        root.right = sortedArrayToBST(nums.sliceArray(nums.size/2 + 1 until nums.size))
        
        return root
    }
}