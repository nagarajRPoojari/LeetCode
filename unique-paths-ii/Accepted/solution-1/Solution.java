// https://leetcode.com/problems/unique-paths-ii

class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int n=grid[0].length;
        int[] dp=new int[n];
        dp[0]=1;
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<n;j++)
                if(grid[i][j]==1) dp[j]=0;
                else if(j>0) dp[j]+=dp[j-1];
        return dp[n-1];
    }
}