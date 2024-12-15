class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        if(nums.size == 0 || nums.size == 1){
            return nums.size
        }

        var a = 0;
        for(i in 1..<nums.size){
            if(nums[a] != nums[i]){
                nums[++a] = nums[i]
            }
        }
        return a+1;
    }
}