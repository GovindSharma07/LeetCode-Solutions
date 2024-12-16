class Solution {
    fun isPalindrome(s: String): Boolean {

        var front = 0
        var rear = s.length-1
        while(front<rear){
            if(!s[front].isLetterOrDigit()){
                front++
            }else if(!s[rear].isLetterOrDigit()){
                rear--
            }else{
                if(s[front].lowercase() == s[rear].lowercase()){
                    front++
                    rear--
                }else{
                    return false
                }
            }
        }
        return true
    }
}