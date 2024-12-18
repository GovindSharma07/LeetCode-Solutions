class Solution {
fun romanToInt(s: String): Int {
  var sum = 0
  var prev = 0

  for (c in s) {
    sum += c.value
    if (c.value > prev) {
      sum -= 2 * prev
    }
    prev = c.value
  }
  return sum
}

private val Char.value: Int
  get() = when(this) {
    'I' -> 1
    'V' -> 5
    'X' -> 10
    'L' -> 50
    'C' -> 100
    'D' -> 500
    'M' -> 1000
    else -> 0
  }
}