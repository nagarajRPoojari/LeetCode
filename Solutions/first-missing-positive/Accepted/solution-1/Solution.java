// https://leetcode.com/problems/first-missing-positive

class Solution {
    public int firstMissingPositive(int[] nums) {
        
        //ans will be in the range [1 to n+1]
        //so just ignore all nums greater than n & negative
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<=0 || nums[i]>n)
                nums[i]=n+1;// a marker
        }
        //
        for(int i=0;i<n;i++){
            int num=Math.abs(nums[i]);
            if(num==n+1)
                continue;
            num--;
            if(nums[num]>0)
                nums[num]*=-1;
        }
        
        for(int i=0;i<n;i++){
            if(nums[i]>0)
                return i+1;
        }
        return n+1;
        
        
    }
}