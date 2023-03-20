// https://leetcode.com/problems/search-in-rotated-sorted-array-ii

class Solution {
    static boolean binarySearch(int[] arr,int target,int low,int high){
        
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target)
                return true;   

            if(arr[mid]<target)
                low=mid+1;
            else if(arr[mid]>target)
                high=mid-1;
        }
        return false;
    }
    
    
    static boolean findMin(int[] arr,int low,int high,int target){
            
        while(low<high){
            int mid=(low+high)/2;
            if(arr[mid]>arr[high])
                low=mid+1;
            else if(arr[mid]<arr[high])
                high=mid;
            else{ //when both are equal
                if(arr[high-1]>arr[high])
                {
                    low=high;
                    break;
                }
                high--;
            }    
        }
        
        int pivot=low;
       
        if(target==arr[pivot])
            return true;
        if(binarySearch(arr,target,0,pivot-1)||binarySearch(arr,target,pivot+1,arr.length-1))
            return true;
        return false;
    }
    public boolean search(int[] nums, int target) {
        return findMin(nums,0,nums.length-1,target);
    }
}