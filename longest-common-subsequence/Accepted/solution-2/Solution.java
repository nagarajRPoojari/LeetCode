// https://leetcode.com/problems/longest-common-subsequence

class Solution {
    public int longestCommonSubsequence(String s, String t) {
        int m=s.length(),n=t.length();
        int[] dp=new int[n+1];
        for(int i=1;i<=m;i++){
            int prev=dp[0];
            for(int j=1;j<=n;j++){
                int temp=dp[j];
                if(s.charAt(i-1)==t.charAt(j-1))
                    dp[j]=prev+1;
                else dp[j]=Math.max(dp[j-1],dp[j]);
                prev=temp;
            }
        }
        return dp[n];
    }
}