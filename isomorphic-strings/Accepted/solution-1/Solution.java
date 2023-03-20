// https://leetcode.com/problems/isomorphic-strings

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map=new HashMap<>();
        if(s.length()!=t.length()) return false;
        for(int c=0;c<s.length();c++){
            if(map.containsKey(s.charAt(c))){
                if( map.get(s.charAt(c))!=t.charAt(c))
                return false;
            }
            map.put(s.charAt(c),t.charAt(c));
        }
        map.clear();
        for(int c=0;c<t.length();c++){
            if(map.containsKey(t.charAt(c))){
                if( map.get(t.charAt(c))!=s.charAt(c))
                return false;
            }
            map.put(t.charAt(c),s.charAt(c));
        }
        return true;
    }
}