// https://leetcode.com/problems/partition-labels

class Solution {
    //approach is similar to jump game 
    public List<Integer> partitionLabels(String s) {
        int[] map=new int[26];
        for(int i=0;i<s.length();i++) map[s.charAt(i)-'a']=i;
        int last=0,start=0;
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            last=Math.max(last,map[s.charAt(i)-'a']);
            if(i==last){
                ans.add(last-start+1);
                start=i+1;
            }
        }
        return ans;
    }
}