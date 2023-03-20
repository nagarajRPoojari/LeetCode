// https://leetcode.com/problems/remove-duplicates-from-sorted-array

class Solution {
    public int removeDuplicates(int[] nums) {
        int first=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[first-1]){
                int temp=nums[i];
                nums[i]=nums[first];
                nums[first]=temp;
                first++;
            }
        }
        return first;
    }
}