class Solution {
    fun maxProfit(prices: IntArray): Int {
        var buy = Int.MAX_VALUE
        var profit = 0
        for(i in prices){
            if(i<buy) buy = i
            else {
                profit = profit + i - buy
                buy = i
            } 
        }
        return profit
    }
}