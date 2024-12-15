class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        if(nums.size == 0) return nums.size
        if(nums.size == 1) return nums.size
        if(nums.size == 2) return nums.size

        var a = 2
       for(i in 2..<nums.size){
        if(nums[a-2] != nums[i]){
            nums[a] = nums[i]
            a++
        }
       }
       return a;
    }
}