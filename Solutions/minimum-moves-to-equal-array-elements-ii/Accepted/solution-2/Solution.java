// https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii

class Solution {
    static int quikSelect(int[] nums,int l,int h,int k){
        if(l==h)
            return nums[l];
        
        int index = new Random().nextInt(h-l + 1) +l;
        int p=partition(nums,l,h,index);
        if(p==k) return nums[p];
        else if(p>k) return quikSelect(nums,l,p-1,k);
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
        int temp=nums[j];
        nums[j]=nums[i];
        nums[i]=temp;
    }
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int count=0;
        int target=quikSelect(nums,0,n-1,n/2);
        
        for(int i=0;i<n;i++){
            count+=Math.abs(nums[i]-target);
        }
        return count;
    }
}