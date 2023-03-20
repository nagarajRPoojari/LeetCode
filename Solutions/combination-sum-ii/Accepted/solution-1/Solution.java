// https://leetcode.com/problems/combination-sum-ii

class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    void helper(int[] arr,int t,int index,List<Integer> temp,boolean[] isUsed){
        if(t==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(t<0)
            return;
        for(int i=index;i<arr.length;i++){
            if(i>0 && arr[i]==arr[i-1] && !isUsed[i-1]) continue;
            temp.add(arr[i]);
            isUsed[i]=true;
            helper(arr,t-arr[i],i+1,temp,isUsed);
            isUsed[i]=false;
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] arr, int t) {
        Arrays.sort(arr);
        ans.clear();
        boolean[] isUsed=new boolean[arr.length];
        Arrays.fill(isUsed,false);
        helper(arr,t,0,new ArrayList<>(),isUsed);
        return ans;
    }
}