// https://leetcode.com/problems/subsets-ii

class Solution {

    
    
    static void  subset(List<List<Integer>> ans,int[] nums,ArrayList<Integer> curr,int i){
         ans.add(new ArrayList<>(curr));
        
        for(int j=i;j<nums.length;j++){
            if(j>i && nums[j]==nums[j-1])
                continue;
            
            curr.add(nums[j]);
            subset(ans,nums,curr,j+1);
            curr.remove(curr.size()-1);
        }
    }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        subset(ans,nums,new ArrayList<>(),0);
        return ans;
        
    }
}