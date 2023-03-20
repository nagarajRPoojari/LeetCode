// https://leetcode.com/problems/pascals-triangle-ii

class Solution {
    public List<Integer> getRow(int n) {
        List<Integer> prev=new ArrayList<>();
        prev.add(1);
        for(int i=1;i<=n;i++){
            List<Integer> curr=new ArrayList<>();
            curr.add(1);
            for(int j=1;j<i;j++){
                curr.add(prev.get(j-1)+prev.get(j));
            }
            curr.add(1);
            prev=curr;
        }
        return prev;
    }
    
}