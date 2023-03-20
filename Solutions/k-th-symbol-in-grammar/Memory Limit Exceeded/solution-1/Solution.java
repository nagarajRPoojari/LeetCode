// https://leetcode.com/problems/k-th-symbol-in-grammar

class Solution {
    
    static String fun(int n){
        if(n==1)
        return "0";
        if(n==2)
        return "01";
        if(n==3)
        return "0110";
        String current="";
        String temp=fun(n-1);
        int l=temp.length();
        current+=temp.substring(0);
        for(int i=2;2*i<Math.pow(2,n-2);i*=2){
            current+=temp.substring(l/i);
        }
        if(temp.charAt(l-1)=='1' ){
            current+="0110";
        }
        else{
            current+="1001";
        } 
        return current;
    }
    public int kthGrammar(int n, int k) {
        String ans=fun(n);
        char c =ans.charAt(k-1);
        return Character.getNumericValue(c);
    }
}













