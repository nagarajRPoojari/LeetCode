// https://leetcode.com/problems/maximum-average-subarray-i

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0,res;
        double avg;
        for(int i=0;i<k;i++)
            sum+=nums[i];
        
        res=sum;
        
        for(int i=k;i<nums.length;i++){
            sum-=nums[i-k];
            sum+=nums[i];
            res=Math.max(res,sum);
        }
        avg=((double)res/k);
        return avg;
    }
}