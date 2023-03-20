// https://leetcode.com/problems/search-in-rotated-sorted-array

class Solution {
    //binary search
    
    
    static int findPivot(int[] arr,int low,int high){

        if(high<low)
            return -1;
        if(low==high)
            return low;
        
        
        int mid=(low+high)/2;
        if(mid<high && arr[mid]>arr[mid+1])
            return mid;
        if(mid>low && arr[mid-1]>arr[mid])
            return mid-1;
        
        if(arr[low]>arr[mid])
            return findPivot(arr,low,mid-1);
        else 
            return findPivot(arr,mid+1,high);
    }
    
    static int binarySearch(int[] arr,int low,int high,int target){
        
        if(low>high)
            return -1;
        
        int mid=(low+high)/2;
        if(arr[mid]==target)
            return mid;
        if(arr[mid]>target)
            return binarySearch(arr,low,mid-1,target);
        return binarySearch(arr,mid+1,high,target);
        
    }
    
    public int search(int[] arr, int target) {
        int n=arr.length;
        int pivot=findPivot(arr,0,n-1);
        
        if(pivot==-1)
            return binarySearch(arr,0,n-1,target);
        if(arr[pivot]==target){
           return pivot; 
        }
        
        if(target<arr[0])
          return  binarySearch(arr,pivot+1,n-1,target);
        return binarySearch(arr,0,pivot-1,target);
        
    }
}