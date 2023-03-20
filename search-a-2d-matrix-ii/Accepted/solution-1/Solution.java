// https://leetcode.com/problems/search-a-2d-matrix-ii

class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int m=mat.length,n=mat[0].length;
        int i=0,j=n-1;
        while(i<m && j>=0){
            if(mat[i][j]==target)
                return true;
            else if(mat[i][j]>target)
                j--;
            else
                i++;
        }
        return false;
    }
}