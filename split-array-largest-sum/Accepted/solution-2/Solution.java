// https://leetcode.com/problems/split-array-largest-sum

class Solution {
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        int[][] dp=new int[k+1][n+1];
        for(int i=1;i<=k;i++) dp[i][1]=nums[0];
        for(int i=1;i<=n;i++) dp[1][i]=dp[1][i-1]+nums[i-1];
        for(int i=2;i<=k;i++)
            for(int j=2;j<=n;j++){
                dp[i][j]=Integer.MAX_VALUE;
                for(int t=1;t<j;t++)
                    dp[i][j]=Math.min(dp[i][j], Math.max(dp[i-1][t],  dp[1][j]-dp[1][t]  ));
                
            }
        return dp[k][n];
    }
}


// sum ( t, j-1 )