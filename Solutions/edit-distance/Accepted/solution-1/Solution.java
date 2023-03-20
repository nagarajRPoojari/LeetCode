// https://leetcode.com/problems/edit-distance

class Solution {
    public int minDistance(String s, String t) {
        int m=s.length(),n=t.length();
        if(m==0) return n;
        else if(n==0) return m;
        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<=m;i++) dp[i][0]=i;
        for(int i=0;i<=n;i++) dp[0][i]=i;
        dp[0][0]=0;
        for(int i=1;i<=m;i++)
            for(int j=1;j<=n;j++)
                if(s.charAt(i-1)==t.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1];
                else
                    dp[i][j]=Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]))+1;
        return dp[m][n];
    }
}