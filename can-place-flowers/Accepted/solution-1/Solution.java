// https://leetcode.com/problems/can-place-flowers

class Solution {
    public boolean canPlaceFlowers(int[] a, int n) {
        int c=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=1 && (i==0 || a[i-1]==0) && (i==a.length-1 || a[i+1]==0)) {
                a[i]=1;
                c++;
            }
        }
        return c>=n;
    }
}