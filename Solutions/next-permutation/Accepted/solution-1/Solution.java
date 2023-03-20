// https://leetcode.com/problems/next-permutation

class Solution {
    static int[] swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        return nums;
    }
    
    static int[] reverse(int[] nums,int i,int j){
        while(i<j)
            nums=swap(nums,i++,j--);     
        return nums;
    }
    
    
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2;
        while(i>=0 && nums[i]>=nums[i+1])i--;
        
        if(i>=0){
            int j=n-1;
            while(nums[j]<=nums[i])
                j--;
            nums=swap(nums,i,j);  
        }
        nums=reverse(nums,i+1,n-1);  
        
    }
    
}