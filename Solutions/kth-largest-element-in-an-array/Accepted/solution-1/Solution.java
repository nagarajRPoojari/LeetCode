// https://leetcode.com/problems/kth-largest-element-in-an-array

class Solution {
    static int quikSelect(int[] nums,int l,int h,int k){
        if(l==h)return nums[l];
        int index=new Random().nextInt(h-l+1)+l;
        int p=partition(nums,l,h,index);
        if(p==k-1)
            return nums[p];
        else if(p>k-1)
            return quikSelect(nums,l,p-1,k);
        return quikSelect(nums,p+1,h,k);
    }
    static int partition(int[] nums,int l,int h,int index){
        swap(nums,index,h);
        int res=l;
        for(int i=l;i<=h;i++)
            if(nums[i]<=nums[h]) swap(nums,res++,i);
        return res-1;
    }
    static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;
        return quikSelect(nums,0,n-1,n-k+1);
    }
}