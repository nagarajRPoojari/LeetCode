// https://leetcode.com/problems/product-of-array-except-self

class Solution {
    public int[] productExceptSelf(int[] arr) {
        
        int n=arr.length;
        int[] ans=new int[n];
        ans[0]=arr[0];
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]*arr[i];
        }
        
        int product=1;
        for(int i=n-1;i>0;i--){
            ans[i]=ans[i-1]*product;
            product*=arr[i];
        }
        ans[0]=product;
        return ans;
    }
}