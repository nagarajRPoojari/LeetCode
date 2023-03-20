// https://leetcode.com/problems/maximum-sum-circular-subarray

class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int curMin=0,curMax=0;
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        int total=0;
        for(int i:nums){
            curMax=Math.max(curMax+i,i);
            max=Math.max(curMax,max);
            curMin=Math.min(curMin+i,i);
            min=Math.min(curMin,min);
            total+=i;
        }
        return max>0 ? Math.max(max,total-min) : max;
    }
}