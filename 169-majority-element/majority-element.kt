class Solution {
    fun majorityElement(nums: IntArray): Int {
        if(nums.size == 1) return nums[0]

        var maxNumber = nums[0]
        var appeared = 0;

        for(i in nums){
            if(maxNumber == i){
                appeared++
            }
            else{
                appeared--
                if(appeared == -1){
                    maxNumber = i
                    appeared = 1
                }
            }
        } 
        return maxNumber
    }
}