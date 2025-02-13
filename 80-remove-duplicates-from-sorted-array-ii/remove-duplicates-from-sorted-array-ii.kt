class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        if(nums.size<3) return nums.size

        var k = 2
        for(i in 2 until nums.size){
            if(nums[i] == nums[k-2]) continue
            nums[k] = nums[i]
            k++
        }
        return k
    }
}