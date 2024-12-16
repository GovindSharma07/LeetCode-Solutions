class Solution {
    fun canJump(nums: IntArray): Boolean {
        if(nums.size == 1) return true

        var power = Int.MIN_VALUE

        for(i in  nums){
            if(power == -1) return false
            if(power<i) power = i
            power--
            
        }



        return true
    }
}