// https://leetcode.com/problems/squares-of-a-sorted-array

class Solution {
    public int[] sortedSquares(int[] nums) {
        int r,l;
        int n=nums.length;
        int[] ans=new int[nums.length];
        int i=0,j=n-1;
        
        for(int x=n-1;x>=0;x--){
            if(Math.abs(nums[i]) >=  Math.abs(nums[j]))
            {
                ans[x]=nums[i]*nums[i];
                i++;
            }
            else{
                ans[x]=nums[j]*nums[j];
                j--;
            }
        }
        return ans;
    }
}