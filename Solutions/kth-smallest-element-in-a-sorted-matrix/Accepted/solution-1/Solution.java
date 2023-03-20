// https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix

class Solution {
    int smallCount(int[][] matrix,int x){
        int count=0,c=matrix[0].length-1;
        for(int r=0;r<matrix.length;r++){
            while(c>=0 && matrix[r][c]>x) c--;
            count+=(c+1);
        }
        return count;    
    }
    public int kthSmallest(int[][] matrix, int k) {
        int m=matrix.length,n=matrix[0].length;
        int l=matrix[0][0],h=matrix[m-1][n-1];
        int res=l;
        while(l<=h){
            int mid=l + (h-l)/2;
            int c=smallCount(matrix,mid);
            if(c>=k) {
                res=mid;
                h=mid-1;
            }
            else l=mid+1;
        }
        return res;
    }
}