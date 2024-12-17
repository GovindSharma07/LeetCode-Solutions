class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        var l = IntArray(nums.size)
        var r = IntArray(nums.size)

        l[0] = 1
        r[nums.size-1] = 1
        for(i in 1..<nums.size){
            l[i] = l[i-1]*nums[i-1]
        }

        for(i in (nums.size - 2) downTo 0){
            r[i] = r[i+1]*nums[i+1]
        }

        for(i in 0..nums.size-1){
            nums[i] = l[i]*r[i]
        }
        return nums
    }
}