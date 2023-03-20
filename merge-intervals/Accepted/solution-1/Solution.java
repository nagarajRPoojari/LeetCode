// https://leetcode.com/problems/merge-intervals

class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr,(i1,i2)->Integer.compare(i1[0],i2[0]));
        
        int res=0;
        for(int i=0;i<arr.length;i++){
            if(arr[res][1]>=arr[i][0]){
                arr[res][1]=Math.max(arr[res][1],arr[i][1]);
                arr[res][0]=Math.min(arr[res][0],arr[i][0]);
            }
            else{
                res++;
                arr[res]=arr[i];
            }
        }
        
        int[][] ans=new int[res+1][2];
        for(int i=0;i<=res;i++)
            ans[i]=arr[i];
        return ans;
    }
}