class Solution {
 fun candy(ratings: IntArray): Int {
    val ans = IntArray(ratings.size) { 1 }

    for (i in 1 until ratings.size) if (ratings[i - 1] < ratings[i]) ans[i] = ans[i - 1] + 1
    for (i in (ratings.size - 2) downTo 0) if (ratings[i + 1] < ratings[i]) ans[i] = maxOf(ans[i], ans[i + 1] + 1)

    // Adding all the candies
    return ans.sum()
}

}