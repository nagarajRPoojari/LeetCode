// https://leetcode.com/problems/max-consecutive-ones

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currentCount=0,res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                currentCount++;
                 res=Math.max(res,currentCount);
            }
            else{
                
                currentCount=0;
            }
            
        }
        
        return res;
    }
}