// https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards

class Solution {
    public int maxScore(int[] arr, int k) {
        int n=arr.length;
        int sum=0,res=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        res=sum;
        for(int i=k-1,j=arr.length-1;i>=0;i--,j--){
            sum-=arr[i];
            sum+=arr[j];
            res=Math.max(res,sum);
        }
        return res;
    }
}