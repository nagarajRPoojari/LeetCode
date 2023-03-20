// https://leetcode.com/problems/combination-sum-ii

class Solution {
    static void combSum(List<List<Integer>> list,ArrayList<Integer> temp,int[] nums,int target,int index,boolean[] isUsed)     {
        if(target==0)
            list.add(new ArrayList<>(temp));
        if(target<0)
            return;
        
        for(int i=index;i<nums.length;i++){
            if(isUsed[i]|| i>0 && nums[i]==nums[i-1]&& !isUsed[i-1])continue;
            
            temp.add(nums[i]);
            isUsed[i]=true;
            combSum(list,temp,nums,target-nums[i],i+1,isUsed);

            isUsed[i]=false;
            temp.remove(temp.size()-1);
        }
        
        
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(candidates);
        combSum(list,new ArrayList<>(),candidates,target,0,new boolean[candidates.length]);
        return list;
    }
}