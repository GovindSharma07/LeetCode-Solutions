class Solution {
    fun summaryRanges(nums: IntArray): List<String> {
        if(nums.size == 0) return  listOf()
        if(nums.size == 1) return listOf(nums[0].toString())

        var ans : MutableList<String> = mutableListOf()
        var s = nums[0].toString()
        for(i in 1 until nums.size){
            if(nums[i] - nums[i-1] == 1){
                if(s.contains("->")) continue
                else s = s + "->"
            }
            else{
                if(s.contains("->")) s = s + nums[i-1].toString()
                ans.add(s)
                s = nums[i].toString()
            }
        }

        if(s.contains("->")) s = s + nums.last().toString()
        ans.add(s)
        return ans
    }
}