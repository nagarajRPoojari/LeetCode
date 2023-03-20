// https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum

class Solution {
    
    static int fun(int[] arr,int i){
        if(i==arr.length-1)
            return 1;
        
        return arr[i]+fun(arr,i+1)+1;
    }
    public int minStartValue(int[] nums) {
        int i,res=Integer.MIN_VALUE;
        for(i=0;i<nums.length;i++){
            if(arr[i]<0)
                break;
            res=Math.min(res,arr[i]);
            
        }
        if(i==nums.length)
            return res;
        return fun(nums,0);
    }
}