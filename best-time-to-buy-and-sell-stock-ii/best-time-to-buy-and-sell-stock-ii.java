class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int left = 0;
        for(int i = 1;i < prices.length;i++){
            int currentDay = prices[left];
            int nextDay = prices[i];
            if(nextDay > currentDay) max += nextDay - currentDay;
            left++;
        }
        
        return max;
    }
}