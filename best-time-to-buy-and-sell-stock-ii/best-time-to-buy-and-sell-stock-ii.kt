class Solution {
    fun maxProfit(prices: IntArray): Int {
        
        var maxProfit = 0
        // for(i in 0..prices.size-2){
        //     if(prices[i] <  prices[i+1]) maxProfit += prices[i+1] - prices[i]
        // }
        for(i in 1..prices.size-1){
            if(prices[i-1] < prices[i]) maxProfit += prices[i] - prices[i-1]
        }
        return maxProfit
        
    }
}