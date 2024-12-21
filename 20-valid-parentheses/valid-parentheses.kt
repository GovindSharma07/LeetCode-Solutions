class Solution {
    val stack = Stack<Char>()
    fun isValid(s: String): Boolean {
        for(c in s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c)    
            }
            else {
                if(stack.isEmpty()) return false
                val char = stack.pop()
                if((c == '}' && char == '{') || 
                   (c == ')' && char == '(') || 
                   (c == ']' && char =='[')) {
                    continue
                   } 
                 else { 
                    return false
                    }
            }
        }

        return stack.isEmpty()
    }
}