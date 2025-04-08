class Solution {
    fun majorityElement(nums: IntArray): Int {
        var maj:Int =  nums[0]
        var count = 0

        for(i in nums){
            if(i == maj) count++
            else if(count != 0) count--
            else {
                maj = i
                count = 1
            }
        } 
        return maj
    }
}