// https://leetcode.com/problems/sort-colors

class Solution {
    static void swap(int[] arr,int i,int j){
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
    public void sortColors(int[] arr) {
        //Dutch national flag algorithm
        int low=0,high=arr.length-1,mid=0;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,mid,low);
                low++;
                mid++;
            }
            else if(arr[mid]==1)
                mid++;
            else
            {
                swap(arr,mid,high);
                high--;
            }
        }
    }
}