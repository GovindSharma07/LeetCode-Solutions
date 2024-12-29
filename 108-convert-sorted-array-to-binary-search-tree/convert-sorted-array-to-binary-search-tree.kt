class Solution {
        fun sortedArrayToBST(nums: IntArray, low: Int = 0, high: Int = nums.size - 1): TreeNode? {
        if (low > high) return null

        val mid = (high + low) / 2
        return TreeNode(nums[mid]).apply{
            left = sortedArrayToBST(nums, low, mid - 1)
            right = sortedArrayToBST(nums, mid + 1, high)
        }
    }
}