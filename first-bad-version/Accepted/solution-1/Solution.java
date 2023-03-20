// https://leetcode.com/problems/first-bad-version

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l=1,h=n;
        while(l<h){
            int mid=l + (h-l)/2 ;
            boolean x=isBadVersion(mid);
            if(x){
                h=mid;
            }
            else
                l=mid+1;
        }
        return l;
    }
}