// https://leetcode.com/problems/house-robber

class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int a=nums[0],b=Math.max(nums[1],nums[0]);
        for(int i=3;i<=nums.length;i++){
            int c=Math.max(b,a+nums[i-1]);
            a=b;
            b=c;
        }
        return b;
    }
}