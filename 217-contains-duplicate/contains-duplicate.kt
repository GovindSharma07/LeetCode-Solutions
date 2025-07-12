class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        if(nums.size == 0 || nums.size == 1) return false
        
        val checkSet = mutableSetOf<Int>()
        
        for(i in nums){
            if(checkSet.contains(i)) return true
            else checkSet.add(i)
        } 

        return false
    }
}