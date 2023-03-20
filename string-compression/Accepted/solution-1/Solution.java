// https://leetcode.com/problems/string-compression

class Solution {
    public int compress(char[] chars) {
        int k=0;
        int i=0;
        while(i<chars.length){
            char c=chars[i];
            int count=0;
            while(i<chars.length && chars[i]==c){
                count++;
                i++;
            }
            if(count==1){
                chars[k++]=c;
            }else{
                chars[k++]=c;
                String x=Integer.toString(count);
                System.out.println(i);
                for(char ch:x.toCharArray())
                    chars[k++]=ch;

            }
        }
        return k;
        
    }
}