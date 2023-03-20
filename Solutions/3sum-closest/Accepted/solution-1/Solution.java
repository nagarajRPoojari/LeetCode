// https://leetcode.com/problems/3sum-closest

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int min=Integer.MAX_VALUE,ans=0;
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i>0 &&nums[i]==nums[i-1])
                continue;
            
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==target)
                    return target;
                else if(sum>target)
                    k--;
                else
                    j++;
                if(Math.abs(sum-target)<min){
                    min=Math.abs(sum-target);
                    ans=sum;
                }
            }
            
        }
        return ans;
    }
}