// https://leetcode.com/problems/maximum-product-subarray

class Solution {
    public int maxProduct(int[] nums) {
        int max_so_far=nums[0],min_so_far=nums[0],res=nums[0];
        
        for(int i=1;i<nums.length;i++){
            int temp=max_so_far;
            max_so_far=Math.max(max_so_far*nums[i],Math.max(nums[i],min_so_far*nums[i]));
            
            min_so_far=Math.min(temp*nums[i],Math.min(nums[i],min_so_far*nums[i]));
            res=Math.max(max_so_far,res);
        }
        
        return res;
    }
}