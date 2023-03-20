// https://leetcode.com/problems/count-and-say

class Solution {
    static StringBuilder helper(StringBuilder str,int n){
        if(n==0) return str;
        int i=0;
        StringBuilder str2=new StringBuilder();
        while(i<str.length()){
            int j=i,count=0;
            char c=str.charAt(i);
            while(j<str.length() && str.charAt(j)==c){
                count++;
                j++;
            }
            str2.append(count);
            str2.append(c);
            i=j;
        }
        return helper(str2,n-1);
        
    }

    public String countAndSay(int n) {
        StringBuilder first=new StringBuilder();
        first.append(1);
        StringBuilder str=helper(first,n-1);
        return str.toString();
    }
}