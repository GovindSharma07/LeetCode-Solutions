class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        if(k%nums.size == 0) return

        val size = nums.size
        val a = k%size

        for(i in 0..<size/2){
            nums[i] = nums[i] + nums[size-i-1]
            nums[size-i-1] =  nums[i] - nums[size-i-1]
            nums[i] =  nums[i] - nums[size-i-1]
        }

        for(i in 0..<a/2){
             nums[i] = nums[i] + nums[a-i-1]
            nums[a-i-1] =  nums[i] - nums[a-i-1]
            nums[i] =  nums[i] - nums[a-i-1]
        }

         for(i in a..<(size+a)/2){
            nums[i] = nums[i] + nums[size+a-i-1]
            nums[size+a-i-1] =  nums[i] - nums[size+a-i-1]
            nums[i] =  nums[i] - nums[size+a-i-1]
        }
    }
}