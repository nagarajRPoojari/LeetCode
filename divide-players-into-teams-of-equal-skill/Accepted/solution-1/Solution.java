// https://leetcode.com/problems/divide-players-into-teams-of-equal-skill

class Solution {
    public long dividePlayers(int[] arr) {
        long ans=0;
        Arrays.sort(arr);
        int n=arr.length;
        int sum=arr[0]+arr[n-1];
        for(int i=0;i<n/2;i++){
            if(arr[i]+arr[n-i-1]!=sum) return -1;
            ans+=(long)(arr[i]*arr[n-i-1]);
        }
        return ans;
    }
}