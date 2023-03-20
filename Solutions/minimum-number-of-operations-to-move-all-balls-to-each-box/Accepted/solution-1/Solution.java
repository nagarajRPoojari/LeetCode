// https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box

class Solution {
    public int[] minOperations(String s) {
        int n=s.length();
        char[] boxes=s.toCharArray();
        int[][] left=new int[n][2];
        int[][] right=new int[n][2];
        left[0][0]=0;
        left[0][1]=boxes[0]-'0';
        for(int i=1;i<n;i++){
            left[i][0]=left[i-1][0]+left[i-1][1];
            left[i][1]=boxes[i]-'0'+left[i-1][1];
        }
        right[n-1][0]=0;
        right[n-1][1]=boxes[n-1]-'0';
        for(int i=n-2;i>=0;i--){
            right[i][0]=right[i+1][0]+right[i+1][1];
            right[i][1]=boxes[i]-'0'+right[i+1][1];
        }
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=left[i][0]+right[i][0];
        }
        return ans;
    }
}