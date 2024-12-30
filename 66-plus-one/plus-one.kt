class Solution {
    fun plusOne(digits: IntArray): IntArray {
       val n = digits.size
        for (i in n - 1 downTo 0) {
            if (digits[i] < 9) {
                digits[i]++
                return digits
            }

            digits[i] = 0
        }

        val newNumber = IntArray(n + 1)
        newNumber[0] = 1

        return newNumber
    }
}