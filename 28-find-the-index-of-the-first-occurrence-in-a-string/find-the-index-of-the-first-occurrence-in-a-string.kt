class Solution {
    fun strStr(haystack: String, needle: String): Int {
        if (needle.isEmpty()) return 0 // Handle the case where needle is empty
        
        var i = 0
        var j = 0
        
        while (i < haystack.length) {
            if (haystack[i] == needle[j]) {
                j++
                if (j == needle.length) return i - j + 1 // Found the match
            } else {
                i = i - j // Reset i to start from the next character after the previous partial match
                j = 0     // Reset j to start matching from the beginning of needle
            }
            i++
        }
        
        return -1 // Return -1 if no match is found
    }
}
