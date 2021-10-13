class Solution {
    fun maxProfit(prices: IntArray): Int {
        var max = 0
        for(i in 1 until prices.size){
            val current = prices[i]
            val prev = prices[i-1]
            if(current > prev) max += (current - prev)
        }
        return max
    }
}