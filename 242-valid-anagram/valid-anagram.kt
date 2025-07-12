class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false
        
        val map = mutableMapOf<Char,Int>()


        for(i in s){
            map[i] = map.getOrDefault(i,0) + 1
        }

         for(i in t){
            map[i] = map.getOrDefault(i,0) - 1
        }

        for(i in map.values) if (i != 0) return false
        return true


    }
}