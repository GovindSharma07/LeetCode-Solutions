class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val ans = mutableListOf<MutableList<String>>()

        for (i in strs.indices) {
            var added = false
            for (group in ans) {
                if (isAna(strs[i], group[0])) {
                    group.add(strs[i])
                    added = true
                    break
                }
            }
            if (!added) {
                ans.add(mutableListOf(strs[i]))
            }
        }

        return ans
    }

    fun isAna(str1: String, str2: String): Boolean {
        if (str1.length != str2.length) return false

        val count = IntArray(26)
        for (i in str1.indices) {
            count[str1[i] - 'a']++
            count[str2[i] - 'a']--
        }
        return count.all { it == 0 }
    }
}
