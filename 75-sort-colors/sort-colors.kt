class Solution {
    fun sortColors(nums: IntArray): Unit {
        val l = MutableList(3){0}
        var a = 0
        nums.forEach{
            l[it]++
        }
        for(i in 0..2) for(j in 0 until l[i]) nums[a++] = i
    }
}