// https://leetcode.com/problems/valid-parentheses

class Solution {
    static boolean areSame(char c,char s){
        return (c=='(' && s==')' || c=='[' && s==']' || c=='{' && s=='}');   
    }
    public boolean isValid(String str) {
        ArrayDeque<Character> s=new ArrayDeque<>();
        for(char c:str.toCharArray()){
            if(c=='('|| c=='[' || c=='{')
             s.push(c);
            else{
                if(s.isEmpty()) return false;
                if(!areSame(s.peek(),c))
                    return false;
                s.pop();
            }
        }
        if(!s.isEmpty()) return false;
        return true;
    }

}