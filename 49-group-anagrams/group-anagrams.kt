    class Solution {
        fun groupAnagrams(strs: Array<String>): List<List<String>> {
            val map = HashMap<String, ArrayList<String>>()
           
            for (s in strs) {
                val array = s.toCharArray()
                array.sort()
                //Two character arrays with the same elements but 
                //different underlying storage might not be equal when converted to strings.
                val key = String(array)
                if (!map.contains(key)) {
                    map[key] = arrayListOf()
                }
                map[key]?.add(s)

            }
            return map.values.toList()
        }
    }