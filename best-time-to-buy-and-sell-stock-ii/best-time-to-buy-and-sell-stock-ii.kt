class Solution {
    fun maxProfit(prices: IntArray): Int {
        
        var max = 0
        for(i in 1 until prices.size){
            val left = prices[i-1]
            val right = prices[i]
            if(right > left) max += (right - left) 
        }
        return max
        
    }
}