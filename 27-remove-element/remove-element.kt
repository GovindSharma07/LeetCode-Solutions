class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var index = 0
        for( i in nums){
            if(i != `val`){
                nums[index] = i;
                index++
            }
        }
        return index
    }
}