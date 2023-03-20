// https://leetcode.com/problems/shortest-distance-to-target-string-in-a-circular-array

class Solution {
    public int closetTarget(String[] words, String target, int startIndex) {
        if(words[startIndex].equals(target)) return 0;
        
        int i=(startIndex+1)%words.length;
        int count1=0,count2=0;
        while(true){
             count1++;
            if(words[i].equals(target)) break;
            if(i==startIndex) break;
            i=(i+1)%words.length;
           
        }
        

        
        if(startIndex==i) return -1;
        int j=(startIndex-1+words.length)%words.length;
        while(true){
             count2++;
            if(words[j].equals(target)) break;
            if(j==startIndex) break;
            j=(j-1+words.length)%words.length;
           
        }


        return Math.min(count1,count2);
    }
}