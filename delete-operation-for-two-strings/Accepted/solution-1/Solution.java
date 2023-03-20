// https://leetcode.com/problems/delete-operation-for-two-strings

class Solution {
    public int minDistance(String s, String t) {
        int m=s.length(),n=t.length();
        int[][] dp=new int[m+1][n+1];
        for(int i=1;i<=m;i++)
            for(int j=1;j<=n;j++)
                if(s.charAt(i-1)==t.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1]+1;
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
        return m+n-2*dp[m][n];            
    }
}