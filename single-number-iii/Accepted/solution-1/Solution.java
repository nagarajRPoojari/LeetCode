// https://leetcode.com/problems/single-number-iii

class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            xor^=nums[i];
        }
        int[] ans=new int[2];
        int x=xor&(~(xor-1));
        ans[0]=0;
        ans[1]=0;
        for(int i=0;i<n;i++){
            int t=x&nums[i];
            if(t==0)
                ans[0]^=nums[i];
            else
                ans[1]^=nums[i];
        }
        return ans;
    }
}