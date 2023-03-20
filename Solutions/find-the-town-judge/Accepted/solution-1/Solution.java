// https://leetcode.com/problems/find-the-town-judge

class Solution {
    public int findJudge(int n, int[][] trust) {
        List<List<Integer>> arr=new ArrayList<>();
        List<List<Integer>> arr2=new ArrayList<>();
        for(int i=0;i<n+1;i++){
            arr.add(new ArrayList<>());
            arr2.add(new ArrayList<>());
        }
        for(int i=0;i<trust.length;i++){
            arr.get(trust[i][0]).add(trust[i][1]);
            arr2.get(trust[i][1]).add(trust[i][0]);
        }
        for(int i=1;i<=n;i++){
            if(arr.get(i).size()==0 && arr2.get(i).size()==n-1) return i;
        }
        return -1;
        

    }
}