// https://leetcode.com/problems/spiral-matrix

class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        List<Integer> ans=new ArrayList<>();
        int top=0,bottom=mat.length-1,left=0,right=mat[0].length-1;
        while(top<=bottom&& left<=right){
            for(int i=left;i<=right;i++)
                ans.add(mat[top][i]);
            top++;
            for(int i=top;i<=bottom;i++)
                ans.add(mat[i][right]);
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--)
                    ans.add(mat[bottom][i]);
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--)
                    ans.add(mat[i][left]);
                left++;
            }
        }
        return ans;
    }
}