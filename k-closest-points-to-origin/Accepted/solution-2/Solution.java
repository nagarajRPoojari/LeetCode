// https://leetcode.com/problems/k-closest-points-to-origin

class Solution {
    class triplet{
        int x;
        int y;
        int d;
        triplet(int a,int b,int c){
            x=a;
            y=b;
            d=c;
        }
    }
    int dist(int x,int y){
        return x*x + y*y;
    }
    public int[][] kClosest(int[][] arr, int k) {
        PriorityQueue<triplet> pq=new PriorityQueue<>((i,j)->Integer.compare(j.d,i.d));
        for(int i=0;i<k;i++){
            int x=arr[i][0],y=arr[i][1];
            pq.add(new triplet(x,y,dist(x,y)));
        } 
        for(int i=k;i<arr.length;i++){
            int x=arr[i][0],y=arr[i][1];
            int d=dist(x,y);
            if(pq.peek().d>=d){
                pq.poll();
                pq.add(new triplet(x,y,d));
            }
        }
        int[][] ans=new int[k][2];
        int i=0;
        while(!pq.isEmpty()){
            ans[i][0]=pq.peek().x;
            ans[i++][1]=pq.poll().y;
        }
        return ans;
    }
}