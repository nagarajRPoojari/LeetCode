// https://leetcode.com/problems/find-pivot-index

class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int[] preSum=new int[n];
        int sum=nums[0];
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