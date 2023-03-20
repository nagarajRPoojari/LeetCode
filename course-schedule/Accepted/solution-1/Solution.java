// https://leetcode.com/problems/course-schedule

class Solution {
    boolean dfs(int s,List<List<Integer>> arr,boolean[] isV,boolean[] recSt){
        isV[s]=true;
        recSt[s]=true;
        for(int i:arr.get(s)){
            if(!isV[i] && dfs(i,arr,isV,recSt)) return true;
            else if(recSt[i]) return true;
        }
        recSt[s]=false;
        return false;
    }

    public boolean canFinish(int n, int[][] mat) {
        List<List<Integer>> arr=new ArrayList<>();
        for(int i=0;i<n;i++) arr.add(new ArrayList<>());
        for(int i=0;i<mat.length;i++){
            arr.get(mat[i][0]).add(mat[i][1]);
        }
        boolean[] isV=new boolean[n];
        boolean[] recSt=new boolean[n];
        for(int i=0;i<n;i++){
            if(!isV[i] && dfs(i,arr,isV,recSt)) return false;
        }
        return true;
                
    }
}