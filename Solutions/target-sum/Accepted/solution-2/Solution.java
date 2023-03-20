// https://leetcode.com/problems/target-sum

class Solution {
    public int findTargetSumWays(int[] nums, int s) {
        int n=nums.length;
        int sum=0;
        for(int i:nums) sum+=i;
        if(s>sum || s<-sum) return 0;
        int[] dp=new int[2*sum+1];
        dp[sum]=1;
        for(int i=0;i<n;i++){
            int[] next=new int[2*sum+1];
            for(int k=-sum;k<=sum;k++){
                if(dp[k+sum]!=0){
                    next[k+nums[i]+sum]+=dp[k+sum];
                    next[k-nums[i]+sum]+=dp[k+sum];
                }
            }
            dp=next;
        }
        return dp[s+sum];
    }
}