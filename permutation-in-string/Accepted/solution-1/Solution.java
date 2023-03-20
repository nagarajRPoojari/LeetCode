// https://leetcode.com/problems/permutation-in-string

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] map=new int[26];
        int n=s1.length();
        for(int i=0;i<n;i++){
            map[s1.charAt(i)-'a']++;
        }
        int ws=0,we=0;
        while(we<s2.length()){
            if(map[s2.charAt(we)-'a']>0){
                map[s2.charAt(we++)-'a']--;
                if(we-ws==n)
                    return true;
            }
            else if(we==ws){
                we++;
                ws++;
            }
            else
                map[s2.charAt(ws++)-'a']++;
        }
        return false;
    }
}