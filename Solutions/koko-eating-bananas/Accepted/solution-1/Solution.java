// https://leetcode.com/problems/koko-eating-bananas

class Solution {
    static boolean isFeasible(int[] piles,int h,int mid){
        int count=0;
        for(int i=0;i<piles.length;i++){
            count+=Math.ceil(1.0*piles[i]/mid);
            
        }
        return (count<=h);
        
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int i:piles)
            max=Math.max(max,i);
        
        int low=1,high=max;
        int res=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(isFeasible(piles,h,mid)){
                res=mid;
                high=mid-1;
            }
            else
                low=mid+1;
        }
        return res;
    }
}