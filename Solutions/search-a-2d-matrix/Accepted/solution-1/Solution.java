// https://leetcode.com/problems/search-a-2d-matrix

class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int m=mat.length,n=mat[0].length;
        int lowi=0,lowj=0;
        int highi=m-1,highj=n-1;
        int lc=0,hc=m*n-1;
        while(lc<=hc){
            int mid=(lc+hc)/2;
            int midi=mid/n;
            int midj=mid%n;
            if(mat[midi][midj]==target)
                return true;
            else if(mat[midi][midj]>target){
                if(highj==0){
                    highi--;
                    highj=n-1;
                }
                else
                    highj--;
                hc--;
            }
            else{
                if(lowj==n-1){
                    lowi++;
                    lowj=0;
                }
                else
                    lowj++;
                lc++;
            }
        }
        return false;
    }
}