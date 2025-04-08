class Solution {
    fun rotate(nums: IntArray, k: Int) {
        val n = nums.size
        val rotations = k % n // Handle cases where k > n

        if (rotations == 0) return // No rotation needed

        val temp = nums.copyOfRange(n - rotations, n) // Store the last 'rotations' elements
        for (i in n - 1 downTo rotations) {
            nums[i] = nums[i - rotations] // Shift the first (n - rotations) elements to the right
        }
        for (i in 0 until rotations) {
            nums[i] = temp[i] // Place the stored last 'rotations' elements at the beginning
        }
    }
}