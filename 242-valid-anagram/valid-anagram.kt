class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false

        var map : MutableMap<Char,Int> = mutableMapOf()

        for(i in s){
            if(map[i] == null) map[i] = 1
            else map[i] = map[i]!!.plus(1)
        }

        for(i in t){
            if(map[i] == null) return false
            else{
                if(map[i] == 0) return false
                else map[i] = map[i]!!.minus(1)
            }
        }

        return true
    }
}