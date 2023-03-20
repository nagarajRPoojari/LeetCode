// https://leetcode.com/problems/palindrome-partitioning-ii

class Solution {
    public int minCut(String s) {
        int n=s.length();
        int[] dp=new int[n];
        boolean[][] isP=new boolean[n][n];
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=0;j<=i;j++)
                if(s.charAt(i)==s.charAt(j) && (i-j<2 || isP[j+1][i-1])){
                    isP[j][i]=true;
                    min= j==0 ? 0 : Math.min(min,dp[j-1]+1);
                }
            dp[i]=min;
        }
   
        return dp[n-1];   
    } 
}