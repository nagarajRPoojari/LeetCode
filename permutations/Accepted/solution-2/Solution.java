// https://leetcode.com/problems/permutations

class Solution {
    //Backtracking  
    
    
    static void permute(List<List<Integer>> list,int[] nums,ArrayList<Integer> temp,int i,boolean[]isUsed){
        if(temp.size()==nums.length)
                 list.add(new ArrayList<>(temp));
        
        for(int j=0;j<nums.length;j++){
            if(isUsed[j])continue;
            
            temp.add(nums[j]);
            isUsed[j]=true;
            permute(list,nums,temp,j+1,isUsed);
            isUsed[j]=false;
            temp.remove(temp.size()-1);
        }
    }
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        permute(list,nums,new ArrayList<>(),0,new boolean[nums.length]);
        return list;
        
    }
}