// https://leetcode.com/problems/magnetic-force-between-two-balls

class Solution {
    static boolean isFeasible(int[] arr,int m,int mid){
        int count=1;
        int first=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[first]>=mid){
                count++;
                first=i;
            }
        }
        return (count>=m);
    }
    public int maxDistance(int[] arr, int m) {
        
        int ans=1;
        Arrays.sort(arr);

        int low=1,high=arr[arr.length-1]-arr[0];

        while(low<=high){
            int mid=(low+high)/2;
            if(isFeasible(arr,m,mid)){
                ans=mid;
                low=mid+1;
            }
            else
                high=mid-1;
        }
        return ans;
    }
}