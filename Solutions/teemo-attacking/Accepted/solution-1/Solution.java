// https://leetcode.com/problems/teemo-attacking

class Solution {
    public int findPoisonedDuration(int[] arr, int d) {
        int res=0;
        int ans=0;
        int s=arr[0],e=arr[0]+d;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>e)
            {
                ans+=e-s;
                s=arr[i];
            }
            e=arr[i]+d;
            
        }
        ans+=e-s;
        return ans;
        
    }
}