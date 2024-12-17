class Solution {
    fun jump(nums: IntArray): Int {
        if(nums.size == 1) return 0
        
        var l = 0
        var r = 0
        var step = 0

        while (r<nums.size-1){
            var far = 0
            for(i in l..r){
                far = maxOf(far,i + nums[i])
            }
            l = r + 1
            r = far
            step++
        }
        return step
    }
}