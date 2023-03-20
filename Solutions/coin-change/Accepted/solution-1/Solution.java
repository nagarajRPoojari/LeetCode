// https://leetcode.com/problems/coin-change

class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[] dp=new int[amount+1];
        for(int i=1;i<=amount;i++){
            dp[i]=Integer.MAX_VALUE;
            for(int j=0;j<n;j++)
                if(coins[j]<=i){
                    int res=dp[i-coins[j]];
                    if(res!=Integer.MAX_VALUE && res+1<dp[i])
                    dp[i]=res+1;
                }
        }
        return  dp[amount]==Integer.MAX_VALUE ? -1 : dp[amount];
    }
}