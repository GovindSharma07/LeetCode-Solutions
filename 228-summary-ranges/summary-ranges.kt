class Solution {
    fun summaryRanges(nums: IntArray): List<String> {
        val result = mutableListOf<String>()

        var i = 0
        while (i < nums.size) {
            var start = nums[i]
            while (i < nums.size - 1 && nums[i + 1] == nums[i] + 1) i++
            if (start == nums[i]) result.add("$start")
            if (start != nums[i]) result.add("$start->${nums[i]}")
            i++
        }

        return result
    }
}