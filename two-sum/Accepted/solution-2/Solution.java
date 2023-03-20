// https://leetcode.com/problems/two-sum

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        int[] ans=new int[2];
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                ans[1]=i;
                ans[0]=map.get(target-nums[i]);
            }
            map.put(nums[i],i);
        }
        return ans;
    }
}