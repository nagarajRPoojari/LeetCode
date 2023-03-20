// https://leetcode.com/problems/non-overlapping-intervals

class Solution {
    public int eraseOverlapIntervals(int[][] nums) {
        Arrays.sort(nums,(i,j)->Integer.compare(i[0],j[0]));
        int count=0;
        int prevEnd=nums[0][1];
        for(int i=1;i<nums.length;i++){
            if(prevEnd> nums[i][0]){
                prevEnd=Math.min(nums[i][1],prevEnd);
                count++;      
            }
            else
                prevEnd=nums[i][1];
            
        }
        return count;
    }
}