class Solution {
    fun setZeroes(matrix: Array<IntArray>) {
        val rows = mutableSetOf<Int>()
        val cols = mutableSetOf<Int>()
        val m = matrix.size
        val n = matrix[0].size

        // Step 1: Record rows and columns that need to be zeroed
        for (i in 0 until m) {
            for (j in 0 until n) {
                if (matrix[i][j] == 0) {
                    rows.add(i)
                    cols.add(j)
                }
            }
        }

        // Step 2: Set zeroes in recorded rows
        for (i in rows) {
            for (j in 0 until n) {
                matrix[i][j] = 0
            }
        }

        // Step 3: Set zeroes in recorded columns
        for (j in cols) {
            for (i in 0 until m) {
                matrix[i][j] = 0
            }
        }
    }
}
