// https://leetcode.com/problems/largest-number

class Solution {
    public String largestNumber(int[] nums) {
        String[] temp=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            temp[i]=Integer.toString(nums[i]);
        }
        Arrays.sort(temp,(a,b)->(b+a).compareTo(a+b));
        if(temp[0].charAt(0)=='0')return "0";
        String str=new String();
        for(int i=0;i<temp.length;i++){
            str+=temp[i];
        }
        
        return str;
    }
}