// https://leetcode.com/problems/max-points-on-a-line

class Solution {
    public int maxPoints(int[][] p) {
        int n=p.length;
        if(n<=2) return n;
        int ans=2;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=2;
                for(int k=j+1;k<n;k++){
                    int x = (p[j][1] - p[i][1]) * (p[k][0] - p[i][0]);
                    int y = (p[k][1] - p[i][1]) * (p[j][0] - p[i][0]);
                    if(x==y)temp++;
                }
                if(temp>ans) ans=temp;
            }
        }
        return ans;
    }
}