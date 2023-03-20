// https://leetcode.com/problems/minimum-path-sum

class Solution {
    public int minPathSum(int[][] dp) {
        int m=dp.length,n=dp[0].length;
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                if(i==0 && j==0) ;
                else if(i==0 && j!=0 ) dp[i][j]+=dp[i][j-1];
                else if(i!=0 && j==0) dp[i][j]+=dp[i-1][j];
                else dp[i][j]+=Math.min(dp[i-1][j],dp[i][j-1]);
        return dp[m-1][n-1];
    }
}