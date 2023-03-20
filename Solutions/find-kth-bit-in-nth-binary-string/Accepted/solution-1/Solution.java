// https://leetcode.com/problems/find-kth-bit-in-nth-binary-string

class Solution {
    public char findKthBit(int n, int k) {
        if(n==1)
            return '0';
        int l=1<<n;
        
        if(k<l/2){
            return findKthBit(n-1,k);
        }
        if(k==l/2){
            return '1';
        }
        
        return (findKthBit(n-1,l-k)=='0'? '1':'0');
    }
}