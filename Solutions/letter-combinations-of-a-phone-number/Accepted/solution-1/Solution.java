// https://leetcode.com/problems/letter-combinations-of-a-phone-number

class Solution {
    static List<String> ans=new ArrayList<String>();
    static void helper(String[] nums,ArrayList<Character> temp,String digits,int index){
        if(temp.size()==digits.length()){
            StringBuilder str=new StringBuilder();
            for(int i=0;i<temp.size();i++) str.append(temp.get(i));
            ans.add(String.valueOf(str));
            return;
        }
        int c=digits.charAt(index)-'0';
        for(int i=0;i<nums[c].length();i++){
            temp.add(nums[c].charAt(i));
            helper(nums,temp,digits,index+1);
            temp.remove(temp.size()-1);

        }
    }


    public List<String> letterCombinations(String digits) {
        String[] nums=new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        ans.clear();
        if(digits.length()==0) return ans;
        helper(nums,new ArrayList<Character>(),digits,0);
        return ans;

    }
}