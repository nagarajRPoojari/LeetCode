// https://leetcode.com/problems/maximal-rectangle

class Solution {
    static int histogram(char[] arr){
        ArrayDeque<Integer> s=new ArrayDeque<>();
        int n=arr.length,res=0;
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                int top=s.pop();
                int curr=(arr[top]-'0')*(s.isEmpty()? i:i-s.peek()-1);
                res=Math.max(res,curr);
            }
            s.push(i);
        }
        while(!s.isEmpty()){
                int top=s.pop();
                int curr=(arr[top]-'0')*(s.isEmpty()? n:n-s.peek()-1);
                res=Math.max(res,curr);
        }
        return res;

    }
    public int maximalRectangle(char[][] matrix) {
        int ans=histogram(matrix[0]);
        for(int i=1;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]=='1'){
                    matrix[i][j]+=matrix[i-1][j]-'0';
                }
            }
            ans=Math.max(ans,histogram(matrix[i]));
        } 
        return ans;
    }
}












