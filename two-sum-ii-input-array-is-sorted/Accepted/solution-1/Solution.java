// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0,j=nums.length-1;
        while(i<j){
            int sum=nums[i]+nums[j];
            if(sum==target)
            {
                int[] ans=new int[2];
                ans[0]=i+1;
                ans[1]=j+1;
                return ans;
            }
            else if(sum>target)
                j--;
            else 
                i++;
        }
        return new int[2];
    }
}