// https://leetcode.com/problems/maximum-subarray

class Solution {
    public int maxSubArray(int[] nums) {
        int min_sum=nums[0],max_sum=nums[0],res=nums[0];
        for(int i=1;i<nums.length;i++){
            int temp=max_sum;
            max_sum=Math.max(nums[i],Math.max(nums[i]+max_sum,min_sum+nums[i]));
            min_sum=Math.min(nums[i],Math.min(nums[i]+temp,min_sum+nums[i]));
            
            res=Math.max(res,max_sum);
        }
        return res;
    }
}