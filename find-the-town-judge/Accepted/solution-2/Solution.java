// https://leetcode.com/problems/find-the-town-judge

class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] arr=new int[n+1];
        for(int[] i:trust){
            arr[i[0]]--;
            arr[i[1]]++;
        }
        for(int i=1;i<=n;i++) if(arr[i]==n-1) return i;
        return -1;
    }
}