class Solution {
    fun isHappy(n: Int): Boolean {
        val seenNumbers = mutableSetOf<Int>()
        var current = n

        while (current != 1) {
            if (seenNumbers.contains(current)) return false
            seenNumbers.add(current)
            current = getSumOfSquares(current)
        }

        return true
    }

    private fun getSumOfSquares(num: Int): Int {
        var sum = 0
        var number = num
        while (number != 0) {
            val digit = number % 10
            sum += digit * digit
            number /= 10
        }
        return sum
    }
}
