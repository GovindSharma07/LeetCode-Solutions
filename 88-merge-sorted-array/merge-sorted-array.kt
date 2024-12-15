class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        if(n == 0){
            return
        }

        var a = m -1
        var b = n -1
        var k = m + n -1

        while(a >= 0 && b >= 0){
            if(nums1[a] >= nums2[b]){
                nums1[k] = nums1[a]
                a--
            }
            else{
                nums1[k] = nums2[b]
                b--
            }
            k--
        }

        while(b >= 0){
            nums1[k] = nums2[b]
            b--
            k--
        }
    }
}