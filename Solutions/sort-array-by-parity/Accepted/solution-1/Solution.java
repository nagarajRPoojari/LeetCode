// https://leetcode.com/problems/sort-array-by-parity

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        //partition
        int first=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                first++;
                int temp=nums[i];
                nums[i]=nums[first];
                nums[first]=temp;
            }
        }
        return nums;
    }
}