class Solution {
    fun lengthOfLastWord(s: String): Int {
        var ans = 0
        var size = s.length
        while(size>0){
            size--
            if(s[size] != ' ') ans++
            else if(ans > 0) return ans
        }
        return ans
    }
}