class Solution {
    fun maxProfit(prices: IntArray): Int {
        var buy = prices[0];
        var profit = 0
        for(i in prices){
            profit = Math.max(profit,i-buy)
            if(i<buy){
                buy = i
            }
        } 
        return profit
    }
}