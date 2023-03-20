// https://leetcode.com/problems/permutations

class Solution {
    //Backtracking  
    
    
    static void permute(List<List<Integer>> list,int[] nums,ArrayList<Integer> temp,int i){
        if(temp.size()==nums.length)
                 list.add(new ArrayList<>(temp));
        
        for(int j=0;j<nums.length;j++){
            if(temp.contains(nums[j]))continue;
            
            temp.add(nums[j]);
            permute(list,nums,temp,j+1);
            temp.remove(temp.size()-1);
        }
    }
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        permute(list,nums,new ArrayList<>(),0);
        return list;
        
    }
}