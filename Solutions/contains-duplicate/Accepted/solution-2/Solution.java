// https://leetcode.com/problems/contains-duplicate

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(nums[0],1);
        for(int i=1;i<nums.length;i++){
            if(map.containsKey(nums[i]))
                return true;
            map.put(nums[i],1);
        }
        return false;
    }
}