// https://leetcode.com/problems/permutations-ii

class Solution {
    //Backtracking
    static void permute(List<List<Integer>> list,ArrayList<Integer> temp,int[] nums,boolean[] isUsed){
        if(temp.size()==nums.length)
            list.add(new ArrayList<>(temp));
        
        for(int j=0;j<nums.length;j++){
               
            if(isUsed[j] || j>0 && nums[j]==nums[j-1]&&!isUsed[j-1])
                continue;
            
            temp.add(nums[j]);
            isUsed[j]=true;
            permute(list,temp,nums,isUsed);
            isUsed[j]=false;
            temp.remove(temp.size()-1);
            
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        permute(list,new ArrayList<>(),nums,new boolean[nums.length]);
        return list;
        
    }
}