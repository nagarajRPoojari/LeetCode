// https://leetcode.com/problems/rotate-array

class Solution {
    static void reverse(int[] arr,int i,int j){
        while(i<j){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        k=(nums.length-k);
        if(k==0) return ;
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        reverse(nums,0,nums.length-1);
    }
}