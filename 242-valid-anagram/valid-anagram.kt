class Solution {
fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) return false

    var tChar = t.toCharArray()
    var cChar = s.toCharArray()
    var countArr = IntArray(26)

    for (i in cChar) {
        countArr[i - 'a']++
    }

    for (i in tChar) {
        countArr[i - 'a']--
    }

    for (i in countArr) {
        if (i > 0) return false
    }
    return true
}
}