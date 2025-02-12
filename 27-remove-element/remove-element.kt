class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var k = 0
        for(i in nums){
            if(i != `val`){
                nums[k] = i
                k++
            }
        }
        return k
    }
}