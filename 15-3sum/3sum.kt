class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
    val ans: MutableList<List<Int>> = mutableListOf()
    nums.sort()

    var i = 0
    while (i < nums.size - 2) {
        // Two-pointer approach
        var l = i + 1
        var r = nums.size - 1
        while (l < r) {
            val sum = nums[i] + nums[l] + nums[r]
            when {
                sum < 0 -> l++ // Increase the left pointer
                sum > 0 -> r-- // Decrease the right pointer
                else -> {
                    ans.add(listOf(nums[i], nums[l], nums[r]))
                    // Move pointers to avoid duplicates
                    while (l < r && nums[l] == nums[l + 1]) l++
                    while (l < r && nums[r] == nums[r - 1]) r--
                    l++
                    r--
                }
            }
        }
        // Move `i` and skip duplicates
        do {
            i++
        } while (i < nums.size - 2 && nums[i] == nums[i - 1])
    }

    return ans
}

}