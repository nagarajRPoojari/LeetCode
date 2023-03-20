// https://leetcode.com/problems/k-closest-points-to-origin

class Solution {
    int dist(int x,int y){
        return x*x + y*y;
    }
    public int[][] kClosest(int[][] arr, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((i,j)->Integer.compare(j[2],i[2]));
        for(int i=0;i<k;i++){
            int x=arr[i][0],y=arr[i][1];
            pq.add(new int[]{x,y,dist(x,y)});
        } 
        for(int i=k;i<arr.length;i++){
            int x=arr[i][0],y=arr[i][1];
            int d=dist(x,y);
            if(pq.peek()[2]>=d){
                pq.poll();
                pq.add(new int[]{x,y,d});
            }
        }
        int[][] ans=new int[k][2];
        int i=0;
        while(!pq.isEmpty()){
            ans[i][0]=pq.peek()[0];
            ans[i++][1]=pq.poll()[1];
        }
        return ans;
    }
}