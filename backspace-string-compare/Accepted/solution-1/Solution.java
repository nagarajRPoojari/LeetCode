// https://leetcode.com/problems/backspace-string-compare

class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1=new Stack<>();
        Stack<Character> t1=new Stack<>();
        for(char c:s.toCharArray())
            if(c=='#'){
                if(s1.isEmpty()) continue;
                 s1.pop();
            }
            else s1.push(c);
        for(char c:t.toCharArray())
            if(c=='#'){
                if(t1.isEmpty()) continue;
                 t1.pop();
            }
            else t1.push(c);
        
        if(s1.size()!=t1.size()) return false;
        
        while(!s1.isEmpty())
            if(s1.pop()!=t1.pop()) return false;
        return true;
        
    }
}