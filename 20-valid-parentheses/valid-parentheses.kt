class Solution {
    fun isValid(s: String): Boolean {
        if(s.length % 2 != 0) return false

        var bucket : MutableList<Char> = mutableListOf()
        for(i in s){
           if(i == '(' || i == '{' || i == '['){
            bucket.add(i)
           }
           else{try{
            if((i == ')' && bucket.last() == '(') || (i == ']' && bucket.last() == '[') || (i == '}' && bucket.last() == '{')) bucket.removeLast()
            else return false}
            catch(e : Exception){
                return false
            }
           }
        }
        if(bucket.size == 0) return true
        else return false
    }
}