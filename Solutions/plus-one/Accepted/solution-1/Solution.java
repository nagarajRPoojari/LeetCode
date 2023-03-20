// https://leetcode.com/problems/plus-one

class Solution {
    public int[] plusOne(int[] digits) {
      
        
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]==9 && i==0 ){
                int[] ans=new int[digits.length+1];
                ans[0]=1;
                digits[0]=0;
                for(int j=1;j<digits.length;j++)
                    ans[j]=digits[j-1];
                return ans;
            }
            if(digits[i]==9){
               digits[i]=0;
                continue;
            }
            else{
                digits[i]++;
                break;
            }
        }
        return digits;
    }
}