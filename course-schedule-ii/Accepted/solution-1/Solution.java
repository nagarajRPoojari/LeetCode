// https://leetcode.com/problems/course-schedule-ii

class Solution {
    boolean dfs(int s,List<List<Integer>> arr,boolean[] isV,Stack<Integer> st,boolean[] recSt){
        isV[s]=true;
        recSt[s]=true;
        for(int i:arr.get(s)){
            if(!isV[i] && dfs(i,arr,isV,st,recSt)) return true;
            else if(recSt[i]) return true;
        }
        st.push(s);
        recSt[s]=false;
        return false;
    }

    public int[] findOrder(int n, int[][] mat) {
        List<List<Integer>> arr=new ArrayList<>();
        for(int i=0;i<n;i++) arr.add(new ArrayList<>());
        for(int i=0;i<mat.length;i++){
            arr.get(mat[i][1]).add(mat[i][0]);
        }
        boolean[] isV=new boolean[n];
        boolean[] recSt=new boolean[n];
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[n];
        for(int i=0;i<n;i++)
            if(!isV[i] && dfs(i,arr,isV,st,recSt)) return new int[0];
        int i=0;
        System.out.println(st.toString());
        while(!st.isEmpty()){
            ans[i++]=st.pop();
        }
        return ans;
    }
}