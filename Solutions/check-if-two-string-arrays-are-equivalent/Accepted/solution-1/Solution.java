// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1=String.join("",word1);
        String str2=String.join("",word2);
        return str1.equals(str2);
    }
}