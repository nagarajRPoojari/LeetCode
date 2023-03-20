// https://leetcode.com/problems/remove-element

class Solution {
    public int removeElement(int[] nums, int val) {
        int first=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                int temp=nums[i];
                nums[i]=nums[first];
                nums[first]=temp;
                first++;
            }
        }
        return first;
    }
}