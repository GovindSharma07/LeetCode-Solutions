class MinStack() {
    var stack:MutableList<Array<Int>> = mutableListOf()
    var low = Int.MAX_VALUE

    fun push(`val`: Int) {
        low = minOf(low,`val`)
        stack.add(arrayOf(`val`,low))    
    }

    fun pop() {
        stack.removeLast()
        if(stack.isEmpty()) low = Int.MAX_VALUE
        else low = stack.last()[1]
    }

    fun top(): Int {
        return stack.last()[0]
    }

    fun getMin(): Int {
        return low
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = MinStack()
 * obj.push(`val`)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */