// https://leetcode.com/problems/first-unique-character-in-a-string

class Solution {
    public int firstUniqChar(String s) {
        int[] arr=new int[127];
        for(char c:s.toCharArray()) arr[c]++;
        for(char c:s.toCharArray()) if(arr[c]==1) return s.indexOf(c);
        return -1;
    }
}