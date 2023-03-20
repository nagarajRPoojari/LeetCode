// https://leetcode.com/problems/triangle

class Solution {
    public int minimumTotal(List<List<Integer>> arr) {
        int n=arr.size();
        int[][] dp=new int[n][n];
        for(int[] i:dp) Arrays.fill(i,Integer.MAX_VALUE);
        return helper(dp,arr,n,0,0);
    }
    int helper(int[][] dp,List<List<Integer>> arr,int n,int i,int j){
        if(i==arr.size()-1) return arr.get(i).get(j);
        if(dp[i][j]!=Integer.MAX_VALUE) return dp[i][j];
        else return dp[i][j]=arr.get(i).get(j) + Math.min(helper(dp,arr,n,i+1,j),helper(dp,arr,n,i+1,j+1));
    }
}