// https://leetcode.com/problems/separate-the-digits-in-an-array

class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            String s=String.valueOf(nums[i]);
            for(char c:s.toCharArray()) ans.add(c-'0');
        }
        int[] res=new int[ans.size()];
        for(int i=0;i<ans.size();i++) res[i]=ans.get(i);
        return res;
    }
}