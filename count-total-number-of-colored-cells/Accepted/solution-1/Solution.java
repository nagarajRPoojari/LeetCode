// https://leetcode.com/problems/count-total-number-of-colored-cells

class Solution {
    public long coloredCells(int n) {
        long count=1;
        for(int i=1;i<=n;i++)
            count+=(i-1)*4;
        return count;
    }
}