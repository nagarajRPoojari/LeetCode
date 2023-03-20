// https://leetcode.com/problems/isomorphic-strings

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map map=new HashMap();
        

        for(Integer c=0;c<s.length();c++){
            if(map.put(s.charAt(c),c)!=map.put(t.charAt(c)+"",c))
                return false;
        }
        
        return true;
    }
}