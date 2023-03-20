// https://leetcode.com/problems/set-matrix-zeroes

class Solution {
    static void set(int[][] mat,int row,int col){
        for(int i=0;i<mat.length;i++)
            mat[i][col]=0;
        for(int i=0;i<mat[0].length;i++)
            mat[row][i]=0;
    }
    public void setZeroes(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        Map<ArrayList<Integer>,Integer> map=new HashMap<>();
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                if(mat[i][j]==0){
                    map.put(new ArrayList<>(Arrays.asList(i,j)),0);
                }
        
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++){
                if(map.containsKey(new ArrayList<>(Arrays.asList(i,j)))){
                    set(mat,i,j);
                }
            }
        
    }
}