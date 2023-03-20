// https://leetcode.com/problems/determine-if-string-halves-are-alike

class Solution {
    static boolean isVowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
    }
    public boolean halvesAreAlike(String s) {
        int count=0;
        for(int i=0;i<s.length()/2;i++){
            count+=(isVowel(s.charAt(i)) ? 1: 0);
        }
        for(int i=s.length()/2;i<s.length();i++){
            count-=(isVowel(s.charAt(i)) ? 1: 0);
        }
        return count==0;
    }
}