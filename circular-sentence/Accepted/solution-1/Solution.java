// https://leetcode.com/problems/circular-sentence

class Solution {
    public boolean isCircularSentence(String sentence) {
        char c=' ';
        String[] arr=sentence.split(" ");
        char first=arr[0].charAt(0);

        
        for(int i=0;i<arr.length;i++){
            if(i==0){
               c=arr[i].charAt(arr[i].length()-1);
                continue;
            }
            if(c!=arr[i].charAt(0)) return false;
            c=arr[i].charAt(arr[i].length()-1);
        }
        if(c!=first) return false;
        return true;
    }
}