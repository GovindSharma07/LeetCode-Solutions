class Solution {
    fun evalRPN(tokens: Array<String>): Int {
        var stack = Stack<Int>()

        for(i in tokens){
            when(i){
                "+" -> {
                    val a = stack.pop()
                    val b = stack.pop()
                    stack.push(b+a)
                }
                "-" -> {
                    val a = stack.pop()
                    val b = stack.pop()
                    stack.push(b-a)
                } 
                "*" -> {
                    val a = stack.pop()
                    val b = stack.pop()
                    stack.push(b*a)
                }
                "/" -> {
                    val a = stack.pop()
                    val b = stack.pop()
                    stack.push(b/a)
                }
                else -> stack.push(i.toInt())
            }
        }

        return stack.pop()


    }
}