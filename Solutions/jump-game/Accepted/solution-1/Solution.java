// https://leetcode.com/problems/jump-game

class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==0) return false;
        if(nums.length==1) return true;
        int maxReach=0,current=0;
        for(int i=0;i<nums.length-1;i++){
            maxReach=Math.max(maxReach,nums[i]+i);
            if(i==current)
                current=maxReach;
            if(nums[i]==0 && maxReach==i) return false;
        }
        return true;
    }
}