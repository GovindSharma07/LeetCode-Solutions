class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        if(s.length != t.length) return false

        var map : MutableMap<Char,Char> = mutableMapOf()

        for(i in 0 until s.length){
            if(map[s[i]] == null){
                if(map.containsValue(t[i])) return false
                map[s[i]] = t[i]
            }
            else{
                if(map[s[i]] != t[i]) return false
            }
        }

        return true
    }
}