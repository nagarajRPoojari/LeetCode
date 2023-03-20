// https://leetcode.com/problems/decode-string

class Solution {
    static int helper(String s,StringBuilder ans,int i){
        while(i<s.length()){
            char c=s.charAt(i);
            if(c==']')
                break;
            else if(Character.isDigit(c)){
                String num="";
                while(s.charAt(i)!='[')
                    num+=s.charAt(i++);
                int count=Integer.parseInt(num);
                StringBuilder pattern=new StringBuilder();
                i=helper(s,pattern,i+1);
                while(count-- != 0)
                    ans.append(pattern);
            }else
                ans.append(c);
            i++;
        }
        return i;
        
    }

    public String decodeString(String s) {
        StringBuilder ans=new StringBuilder();
        helper(s,ans,0);
        return ans.toString();
    }
}