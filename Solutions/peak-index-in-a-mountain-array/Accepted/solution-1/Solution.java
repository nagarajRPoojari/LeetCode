// https://leetcode.com/problems/peak-index-in-a-mountain-array

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(mid==0)
            {
                low=mid+1;
                continue;
            }
            if(mid==n-1)
            {
                high=mid-1;
                continue;
                
            }
            
            if(mid>0 && arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1] && mid<n-1)
                return mid;
            else if(mid>0 && arr[mid]>arr[mid-1])
                low=mid+1;
            else
                high=mid-1;
        }
        return -1;
    }
}