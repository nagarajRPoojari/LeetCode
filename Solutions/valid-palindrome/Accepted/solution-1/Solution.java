// https://leetcode.com/problems/valid-palindrome

class Solution {
    public boolean isPalindrome(String s) {
       StringBuilder str=new StringBuilder();
       s=s.toLowerCase();
       for(char c:s.toCharArray()){
           if(c>=97 && c<=122 || (c>=48 && c<=57))
                str.append(c);
       }
       return helper(str); 
    }
    
    static boolean helper(StringBuilder s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}