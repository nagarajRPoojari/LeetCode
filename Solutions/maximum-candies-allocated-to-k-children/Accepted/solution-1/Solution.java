// https://leetcode.com/problems/maximum-candies-allocated-to-k-children

class Solution {
    static boolean isFeasible(int[] candies,long k,int mid){
        if(mid==0)
            return true;
        long count=0;
        for(int i=0;i<candies.length;i++){
            count+=(long)candies[i]/mid;
        }
        return count>=k;
    } 
    
    public int maximumCandies(int[] candies, long k) {
        int max=0;
        for(int i:candies)
            max=Math.max(max,i);
        
        int low=1,high=max;
        int res=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(isFeasible(candies,k,mid))
            {
                res=mid;
                low=mid+1;
            }
            else
                high=mid-1;
        }
        return res;
    }
}