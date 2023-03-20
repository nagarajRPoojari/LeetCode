// https://leetcode.com/problems/find-all-anagrams-in-a-string

class Solution {
    
    public List<Integer> findAnagrams(String s, String p) {
        int n=p.length();
        List<Integer> ans=new ArrayList<Integer>();
        int[] map=new int[26];
        int i=0;
        while(i<n)
            map[p.charAt(i++)-'a']++;
        
        int ws=0,we=0;
        while(we<s.length()){
            if(map[s.charAt(we)-'a']>0){
                map[s.charAt(we++)-'a']--;
                if(we-ws==n)
                    ans.add(ws);
            }
            else if(we==ws){
                we++;
                ws++;
            }
            else
                map[s.charAt(ws++)-'a']++;
        }
        return ans;
        
        
    }
}