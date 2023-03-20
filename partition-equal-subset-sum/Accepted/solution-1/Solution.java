// https://leetcode.com/problems/partition-equal-subset-sum

class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int total=0;
        for(int i:nums) total+=i;
        if(total%2!=0) return false;
        boolean[][] dp=new boolean[n+1][(total/2)+1];
        for(int i=0;i<=n;i++)
            dp[i][total/2]=true;

        for(int i=1;i<=n;i++)
            for(int j=0;j<total/2;j++){
                dp[i][j]=dp[i-1][j];
                if(nums[i-1]+j<=total/2) dp[i][j]= dp[i][j] || dp[i-1][j+nums[i-1]];
            }
        return dp[n][0];
    }
}


/**
int total=0;
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        for(int i:nums) total+=i;
        return helper(nums,n,0);
    }
    boolean helper(int[] nums,int n,int sum){
        if(total-sum==sum) return true;
        if(n==0) return false;
        return helper(nums,n-1,sum)|| helper(nums,n-1,sum+nums[n-1]);
    }
 */