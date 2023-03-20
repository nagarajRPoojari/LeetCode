// https://leetcode.com/problems/shuffle-the-array

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans=new int[nums.length];
        int i=0,j=n,k=0;
        while(k<nums.length-1){
            ans[k++]=nums[i++];
            ans[k++]=nums[j++];
        }
        return ans; 
    }
}