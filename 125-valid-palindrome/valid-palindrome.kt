class Solution {
    fun isPalindrome(s: String): Boolean {
        if(s.length == 0 || s.length == 1) return true
        val  newStr = s.filter{it.isLetterOrDigit()}.lowercase()
        var front = 0
        var rear = newStr.length -1
        while(front<rear){
            if(newStr[front] == newStr[rear]){
                front++
                rear--
            }else return false
        }
        return true
    }
}