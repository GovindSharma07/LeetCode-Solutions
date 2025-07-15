class Solution {
    fun sortColors(arr: IntArray): Unit {

        //Bucket Sort
        var a = 0
        var b = 0
        var c = 0
        for(i in arr) {
            if(i == 0) a++
            else if(i == 1) b++
            else c++
        }

        for(i in 0..arr.size - 1) {
            if(a > 0) {
                arr[i] = 0
                a--
            }
            else if(b > 0) {
                arr[i] = 1
                b--
            }
            else if(c > 0)  {
                arr[i] = 2
                c--
            }
        }
    }
}