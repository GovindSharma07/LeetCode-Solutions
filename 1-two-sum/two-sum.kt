class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var map :HashMap<Int,Int> = HashMap<Int,Int>()

        for(i in 0 until nums.size){
            if(map.get(target-nums[i]) != null) return intArrayOf(map.get(target-nums[i]) as Int,i)
            else map.put(nums[i],i)
        }

        return intArrayOf(0,0)
    }
}