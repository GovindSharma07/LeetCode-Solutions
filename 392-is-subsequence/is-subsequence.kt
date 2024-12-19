class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        
        //if no string in t
        if(t.length == 0){
            if(s.length == 0) return true
            else return false
        }

        //if no string in s
        if(s.length == 0) return true


        var i = 0
        var j = 0

        while (i < t.length && j < s.length){
            if(t[i] == s[j]) j++
            i++
        }

        if(j == s.length) return true

        return false
    }
}