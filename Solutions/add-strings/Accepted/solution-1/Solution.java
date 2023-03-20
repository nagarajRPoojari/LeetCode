// https://leetcode.com/problems/add-strings

class Solution {
    public String addStrings(String num1, String num2) {
        String res="";
        int carry=0;
        int i=num1.length()-1;
        int j=num2.length()-1;
        while(i>=0 || j>=0 || carry!=0){
            int a=(i>=0)? num1.charAt(i)-'0':0;
            int b=(j>=0)? num2.charAt(j)-'0':0;
            int sum=a+b+carry;
            res+=(sum)%10;
            carry=sum/10;
            i--;
            j--;
        }
        StringBuilder ans=new StringBuilder();
        ans.append(res);
        
        return (ans.reverse()).toString();
    }
}