class Solution {
        fun sortedArrayToBST(nums: IntArray, low: Int = 0, high: Int = nums.size - 1): TreeNode? {
        if (low > high) return null

        return TreeNode(nums[(high + low) / 2]).apply{
            left = sortedArrayToBST(nums, low, (high + low) / 2 - 1)
            right = sortedArrayToBST(nums, (high + low) / 2 + 1, high)
        }
    }
}