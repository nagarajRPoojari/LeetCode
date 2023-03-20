// https://leetcode.com/problems/house-robber

class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int a=0,b=0;
        for(int i=0;i<nums.length;i++){
            int c=Math.max(b,a+nums[i]);
            a=b;
            b=c;
        }
        return b;
    }
}