// https://leetcode.com/problems/find-the-middle-index-in-array

class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int sum=nums[0];
        int[] preSum=new int[n];
        preSum[0]=0;
        for(int i=1;i<n;i++){
            preSum[i]=preSum[i-1]+nums[i-1];
            sum+=nums[i];
        }
        
        for(int i=0;i<n;i++){
            if(preSum[i]==sum-preSum[i]-nums[i])
                return i;
        }
        return -1;
    }
}