// https://leetcode.com/problems/house-robber-ii

class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        return Math.max(robHelper(nums,0,n-2),robHelper(nums,1,n-1));
    }
    public int robHelper(int[] nums,int l,int r) {
        int a=0,b=0;
        for(int i=l;i<=r;i++){
            int c=Math.max(b,a+nums[i]);
            a=b;
            b=c;
        }
        return b;
    }
}