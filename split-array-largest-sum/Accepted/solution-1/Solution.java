// https://leetcode.com/problems/split-array-largest-sum

class Solution {
    static boolean isFeasible(int[] nums,int k,int mid){
        int count=1;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i]>mid){
                count++;
                sum=nums[i];
            }
            else{
                sum+=nums[i];
            }
        }
        if(count<=k)
            return true;
        else 
            return false;
    }
    
    public int splitArray(int[] nums, int k) {
        int sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max=Math.max(max,nums[i]);
        }
        int res=0;
        int low=max,high=sum;
        while(low<=high){
            int mid=(low+high)/2;
            if(isFeasible(nums,k,mid)){
               res=mid;
               high=mid-1;
            }
            else
                low=mid+1;
        }
        return res;
    }
}