// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days

class Solution {
    static boolean isFeasible(int[] nums,int days,int mid){
        int daysCount=1,sum=0;
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i]>mid){
                daysCount++;
                sum=nums[i];
            }
            else
                sum+=nums[i];
        }
        return (daysCount<=days);
    }
    
    public int shipWithinDays(int[] nums, int days) {
        int n=nums.length;
        int max=0,sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            max=Math.max(max,nums[i]);
        }
        int low=max,high=sum,res=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(isFeasible(nums,days,mid)){
                res=mid;
                high=mid-1;
            }
            else
                low=mid+1;
        }
        return res;
    }
}