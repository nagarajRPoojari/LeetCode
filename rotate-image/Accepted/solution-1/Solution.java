// https://leetcode.com/problems/rotate-image

class Solution {
    static void swap(int[][] mat,int i,int j){
        int temp=mat[i][j];
        mat[i][j]=mat[j][i];
        mat[j][i]=temp;
    }
    static void swap2(int[][] mat,int high,int low,int i){
        int temp=mat[i][low];
        mat[i][low]=mat[i][high];
        mat[i][high]=temp;
    }
    public void rotate(int[][] mat) {
        int m=mat.length,n=mat[0].length;
        for(int i=0;i<m;i++){
            for(int j=i;j<n;j++)
                swap(mat,i,j);
        }
        int high=n-1,low=0;
        while(low<high){
            for(int i=0;i<m;i++){
                swap2(mat,high,low,i);
            }
            high--;
            low++;
        }
        
    }
}