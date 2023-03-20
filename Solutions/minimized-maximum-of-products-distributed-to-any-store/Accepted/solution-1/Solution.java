// https://leetcode.com/problems/minimized-maximum-of-products-distributed-to-any-store

class Solution {
    static boolean isFeasible(int[] nums,int n,int mid){
        int count=0;
        for(int i=0;i<nums.length;i++){
            
                count+=nums[i]/mid+1;
                
                if(nums[i]%mid==0)
                    count--;
            
            
        }
        return (count<=n);
    }
    public int minimizedMaximum(int n, int[] nums) {
        int max=0;
        
        for(int i=0;i<nums.length;i++)
            max=Math.max(max,nums[i]);
        
        
        
        int low=1,high=max;
        int res=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(isFeasible(nums,n,mid)){
                res=mid;
                high=mid-1;
            }
            else
                low=mid+1;
        }
        return res;
    }
}