// https://leetcode.com/problems/maximal-square

class Solution {
    public int maximalSquare(char[][] arr) {
        int m=arr.length , n=arr[0].length;
        int[][] dp=new int[m+1][n+1];
        int max=0;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++)
                if(arr[i-1][j-1]=='1'){
                    dp[i][j]=Math.min(dp[i][j-1],Math.min(dp[i-1][j],dp[i-1][j-1]))+1;
                    max=Math.max(max,dp[i][j]);
                }
        }
        return max*max;
    }
}