// https://leetcode.com/problems/decode-string

class Solution {
    public String decodeString(String s) {
        
        ArrayDeque<Character> stack=new ArrayDeque<>();
        for(char c:s.toCharArray()){
            if(c==']'){
                StringBuilder str=new StringBuilder();
                while(!stack.isEmpty() && stack.peek()!='[')
                    str.append(stack.pop());
                stack.pop();
                StringBuilder num=new StringBuilder();
                while(!stack.isEmpty() && Character.isDigit(stack.peek()))
                    num.append(stack.pop());
                num.reverse();
                
                int count=Integer.parseInt(num.toString());
                while(count!=0){
                    for(int i=str.length()-1;i>=0;i--)
                        stack.push(str.charAt(i));
                    count--;
                }                
            }
            else
                stack.push(c);

        }

        int len=stack.size();
        String ans="";
        for(int i=0;i<len;i++){
            ans+=stack.removeLast();
        }
        return ans;
    }
}