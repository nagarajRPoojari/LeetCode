// https://leetcode.com/problems/total-hamming-distance

class Solution {
    public int totalHammingDistance(int[] nums) {
        int count=0;
        int c=0;
        for(int i=0;i<31;i++){
            int o=0;
            for(int j=0;j<nums.length;j++){
                o+=nums[j]>>i&1;
            }
            count+=o*(nums.length-o);
        }
        return count;
    }
}