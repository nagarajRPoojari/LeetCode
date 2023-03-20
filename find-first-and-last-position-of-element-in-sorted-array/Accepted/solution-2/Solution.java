// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array

class Solution {
    
    static int firstIndex(int[] arr,int target){
        int index=-1;
        
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=target)
                high=mid-1;
            else if(arr[mid]<target)
                low=mid+1;
            if(arr[mid]==target)
                index=mid;
        }
        return index;
    }
    static int lastIndex(int[] arr,int target){
        int index=-1;
        
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target)
                high=mid-1;
            else if(arr[mid]<=target)
                low=mid+1;
            if(arr[mid]==target)
                index=mid;
        }
        return index;
    }
    
    
    public int[] searchRange(int[] arr, int target) {
        int[] ans=new int[2];
        ans[0]=firstIndex(arr,target);
        ans[1]=lastIndex(arr,target);
        return ans;
    }
}