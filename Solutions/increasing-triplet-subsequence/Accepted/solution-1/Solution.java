// https://leetcode.com/problems/increasing-triplet-subsequence

class Solution {
    public boolean increasingTriplet(int[] nums) {
        int min2=Integer.MAX_VALUE,min1=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min1){
                min1=nums[i];
            }
            if(min2!=Integer.MAX_VALUE && nums[i]<min2 && nums[i]>min1){
                min2=nums[i];
            }
            if(min2==Integer.MAX_VALUE && nums[i]>min1) {
                min2=nums[i];
            }
            if(min2!=Integer.MAX_VALUE && nums[i]>min2){
                return true;
            }
        }
        return false;
    }
}