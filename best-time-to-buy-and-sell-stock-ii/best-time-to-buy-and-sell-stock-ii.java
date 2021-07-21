class Solution {
    public int maxProfit(int[] prices) {
        
        int max = 0;
        for(int i = 1;i < prices.length;i++){
            int currentPrice = prices[i-1];
            int nextDayPrice = prices[i];
            if(nextDayPrice > currentPrice) max += nextDayPrice - currentPrice; 
        }
        
        return max;

    }
}