class Solution {
    fun wordPattern(pattern: String, s: String): Boolean {
        val t = s.split(" ");
        if(pattern.length != t.size) return false

        var map : MutableMap<Char,String> = mutableMapOf()

        for(i in 0 until pattern.length){
            if(map[pattern[i]] == null){
                if(map.containsValue(t[i])) return false
                map[pattern[i]] = t[i]
            }
            else{
                if(map[pattern[i]] != t[i]) return false
            }
        }

        return true
    }
}