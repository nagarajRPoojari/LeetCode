// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array

class Solution {
    static int findPivot(int[] arr,int low,int high){
        if(low>high)
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
        return findPivot(arr,mid+1,high);     
    }
    
    
    
    public int findMin(int[] arr) {
        int n=arr.length;
        int pivot=findPivot(arr,0,n-1);
        if(pivot==-1 ||pivot==n-1)
            return arr[0];
        return arr[pivot+1];
    }
}