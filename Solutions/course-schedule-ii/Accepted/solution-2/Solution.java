// https://leetcode.com/problems/course-schedule-ii

class Solution {
    public int[] findOrder(int n, int[][] mat) {
        List<List<Integer>> arr=new ArrayList<>();
        for(int i=0;i<n;i++) arr.add(new ArrayList<>());
        for(int i=0;i<mat.length;i++){
            arr.get(mat[i][1]).add(mat[i][0]);
        }
        Queue<Integer> q=new LinkedList<>();
        int[] d=new int[n];
        for(List<Integer> i:arr) for(int j:i) d[j]++;
        for(int i=0;i<n;i++) if(d[i]==0) q.add(i);
        int count=0;
        int[] ans=new int[n];
        int i=0;
        while(!q.isEmpty()){
            int u=q.poll();
            ans[i++]=u;
            count++;
            for(int v:arr.get(u))
                if(--d[v]==0) q.add(v);
        }
        if(count!=n) return new int[0];
        return ans;
    }
}