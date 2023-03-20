// https://leetcode.com/problems/subsets

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int l=(int)Math.pow(2,nums.length);
        
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<l;i++){
            List<Integer> temp=new ArrayList<Integer>();
            for(int j=0;j<nums.length;j++){
                int x=(i>>j)&1;
                
                if(x==1){
                    temp.add(nums[j]);
                }
            }
            ans.add(temp);
        }
        
        return ans;
    }
}