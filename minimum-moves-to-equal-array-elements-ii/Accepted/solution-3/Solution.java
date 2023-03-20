// https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii

class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid=nums[nums.length/2];
        int count=0;
        for(int i:nums) count+=Math.abs(i-mid);
        return count;
    }
}