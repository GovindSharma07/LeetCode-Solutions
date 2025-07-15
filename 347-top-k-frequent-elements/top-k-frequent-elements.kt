class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val freqMap = mutableMapOf<Int, Int>()
        nums.forEach { freqMap[it] = freqMap.getOrDefault(it, 0) + 1 }

        // Initialize bucket (index = frequency)
        val buckets = Array<MutableList<Int>>(nums.size + 1) { mutableListOf() }
        for ((num, freq) in freqMap) {
            buckets[freq].add(num)
        }

        val result = mutableListOf<Int>()
        for (i in buckets.size - 1 downTo 0) {
            for (num in buckets[i]) {
                result.add(num)
                if (result.size == k) return result.toIntArray()
            }
        }

        return intArrayOf()
    }
}
