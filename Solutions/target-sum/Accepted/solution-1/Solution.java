// https://leetcode.com/problems/target-sum

class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return sol(nums,nums.length,target);
    }
    int sol(int[] nums,int n,int target){
        if(n==0 && target==0) return 1;
        else if(n==0) return 0;
        return sol(nums,n-1,target-nums[n-1])+sol(nums,n-1,target+nums[n-1]);
    }
}