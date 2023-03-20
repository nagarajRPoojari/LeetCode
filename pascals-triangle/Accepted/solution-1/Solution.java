// https://leetcode.com/problems/pascals-triangle

class Solution {
 
    
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> row=new ArrayList<Integer>();
        
        for(int i=0;i<numRows;i++){
            
            row.add(0,1);
            for(int j=1;j<row.size()-1;j++){
                row.set(j,row.get(j)+row.get(j+1));
            }
            ans.add(new ArrayList<>(row));
        }
        return ans;
        
    }
}