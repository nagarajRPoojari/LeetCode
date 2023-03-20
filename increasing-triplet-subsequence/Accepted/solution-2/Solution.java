// https://leetcode.com/problems/increasing-triplet-subsequence

class Solution {
    public boolean increasingTriplet(int[] nums) {
        int small=Integer.MAX_VALUE,big=Integer.MAX_VALUE;
        for(int i:nums){
            if(i<=small) small=i;
            else if(i<=big)  big=i;
            else return true;
        }
        return false;
    }
}