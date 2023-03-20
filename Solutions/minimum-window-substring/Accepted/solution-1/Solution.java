// https://leetcode.com/problems/minimum-window-substring

class Solution {
    public String minWindow(String s, String t) {
        int m=s.length(),n=t.length();
        int[] freq=new int[128];
        int charCount=0;
        for(int i=0;i<n;i++){
            freq[t.charAt(i)]++;
            charCount++;
        }
        int i=0,j=0;
        int start_index=0,min_length=Integer.MAX_VALUE;
        while(j<m){
            if(freq[s.charAt(j)]>0) charCount--;
            freq[s.charAt(j)]--;
            j++;
            while(charCount==0){
                if(j-i<min_length){
                    min_length=j-i;
                    start_index=i;
                }
                freq[s.charAt(i)]++;
                if(freq[s.charAt(i)]>0)
                    charCount++;
                i++;
            }
        }
        return (min_length==Integer.MAX_VALUE)?"":s.substring(start_index,start_index+min_length);
    }
}