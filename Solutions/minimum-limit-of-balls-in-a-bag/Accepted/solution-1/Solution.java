// https://leetcode.com/problems/minimum-limit-of-balls-in-a-bag

class Solution {
    static boolean isFeasible(int[] nums,int maxOps,int mid){
        int opsCount=0;
        for(int i=0;i<nums.length;i++){  
            if(nums[i]>mid){
                opsCount+=nums[i]/mid;
                if(nums[i]%mid==0)
                    opsCount--;
            }  
        }
        return (opsCount<=maxOps);   
    }
    
    public int minimumSize(int[] nums, int maxOps) {
        int max=0;
        for(int i=0;i<nums.length;i++)
            max=Math.max(max,nums[i]);
        int low=1,high=max;
        int res=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(isFeasible(nums,maxOps,mid)){
                res=mid;
                high=mid-1;
            }
            else
                low=mid+1;
        }
        return res;
    }
}