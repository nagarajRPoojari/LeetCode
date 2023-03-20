// https://leetcode.com/problems/combination-sum

class Solution {
    static void combSum(List<List<Integer>> list,ArrayList<Integer> temp,int[] nums,int currSum,int target,int index){
        if(currSum==target)
            list.add(new ArrayList<>(temp));
        if(currSum>target)
            return;
        
        
        for(int i=index;i<nums.length;i++){
            temp.add(nums[i]);
            combSum(list,temp,nums,currSum+nums[i],target,i);
            temp.remove(temp.size()-1);
        }
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(candidates);
        combSum(list,new ArrayList<>(),candidates,0,target,0);
        return list;
    }
}