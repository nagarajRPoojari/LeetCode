// https://leetcode.com/problems/longest-substring-without-repeating-characters

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int i=0,j=0;
        int maxlen=0;
        while(j<s.length()){
            while(set.contains(s.charAt(j)) && i<j)
                set.remove(s.charAt(i++));
            
            set.add(s.charAt(j));
            maxlen=Math.max(maxlen,set.size());
            j++;
        }
        return maxlen;
    }
}