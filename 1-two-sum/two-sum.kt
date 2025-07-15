class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val a = mutableMapOf<Int,Int>()
        for(i in 0 until nums.size){
            if(a[target-nums[i]] == null) a[nums[i]] = i
            else return intArrayOf(a.getOrDefault(target-nums[i],0),i)
        }
        return intArrayOf(-1,-1)
    }
}