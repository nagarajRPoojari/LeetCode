// https://leetcode.com/problems/longest-increasing-subsequence

class Solution {
    int ceil(int[] tail,int l,int r,int key){
        while(l<r){
            int m= l +(r-l)/2;
            if(tail[m]>=key) r=m;
            else l=m+1;
        }
        return r;
    }
    public int lengthOfLIS(int[] arr) {
        int len=1,n=arr.length;
        int[] tail=new int[n];
        tail[0]=arr[0];
        for(int i=1;i<n;i++)
            if(tail[len-1]<arr[i])
                tail[len++]=arr[i];
            else tail[ceil(tail,0,len-1,arr[i])]=arr[i];
        return len;        
    }
}