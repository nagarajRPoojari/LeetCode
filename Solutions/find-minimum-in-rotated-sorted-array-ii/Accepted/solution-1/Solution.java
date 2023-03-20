// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii

class Solution {
    
    static int findPivot(int[] arr,int low,int high){
            
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
        return arr[low];
    }
    
    public int findMin(int[] arr) {
        return findPivot(arr,0,arr.length-1);
    }
}