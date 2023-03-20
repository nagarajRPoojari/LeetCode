// https://leetcode.com/problems/maximum-subarray

class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum=nums[0],res=nums[0];
        for(int i=1;i<nums.length;i++){
            max_sum=Math.max(nums[i],nums[i]+max_sum);            
            res=Math.max(res,max_sum);
        }
        return res;
    }
}