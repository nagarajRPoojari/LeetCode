// https://leetcode.com/problems/best-time-to-buy-and-sell-stock

class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int currMax=0;
        for(int i=1;i<prices.length;i++){
            currMax=Math.max(0,currMax+=prices[i]-prices[i-1]);
            profit=Math.max(profit,currMax);
        }
        
        
        return profit;
    }
}