// https://leetcode.com/problems/rotting-oranges

class Solution {


    public int orangesRotting(int[][] g) {
        Queue<int[]> q=new LinkedList<>();
        int[][] cc=new int[][]{{-1,0},{1,0},{0,1},{0,-1}};
        int fresh=0;
        for(int i=0;i<g.length;i++)
            for(int j=0;j<g[0].length;j++)
                if(g[i][j]==2)q.add(new int[]{i,j});
                else if(g[i][j]==1) fresh++;
        if(fresh==0) return 0;
        if(q.size()==0) return -1;
        int count=0;
        while(!q.isEmpty()){
            int s=q.size();
            for(int i=0;i<s;i++){
                int[] b=q.poll();
                for(int[] a:cc){
                    int x=a[0]+b[0];
                    int y=a[1]+b[1];
                    if(x<0 || y<0 || x==g.length || y==g[0].length || g[x][y]==0 ||g[x][y]==2) continue;
                    g[x][y]=2;
                    q.add(new int[]{x,y});
                    fresh--;
                } 
            }
            count++;
        }
        System.out.println(fresh);
        return fresh!=0 ?-1 :count-1;
    }
}