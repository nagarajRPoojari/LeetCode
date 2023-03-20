// https://leetcode.com/problems/find-all-duplicates-in-an-array

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans=new ArrayList<Integer>();
        
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
               ans.add(nums[i]); 
            }
        }
        return ans;
        
        
    }
}