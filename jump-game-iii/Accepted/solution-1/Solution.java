// https://leetcode.com/problems/jump-game-iii

class Solution {
    boolean dfs(int[] arr,int s,boolean[] isV){
        if(s>=arr.length || s<0 || isV[s]) return false;
        isV[s]=true;
        if(arr[s]==0) return true;
        return dfs(arr,s-arr[s],isV) || dfs(arr,s+arr[s],isV);
    }

    public boolean canReach(int[] arr, int start) {
        boolean[] isV=new boolean[arr.length];
        return dfs(arr,start,isV);
    } 
}