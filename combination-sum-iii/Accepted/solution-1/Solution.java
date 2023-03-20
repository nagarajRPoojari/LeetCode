// https://leetcode.com/problems/combination-sum-iii

class Solution {
    static void combSum(List<List<Integer>> list,ArrayList<Integer> temp,int k,int n,int index){
        if(temp.size()==k && n==0)
                list.add(new ArrayList<>(temp));
 
        for(int i=index;i<=9;i++){
            
            temp.add(i);
            combSum(list,temp,k,n-i,i+1);
            temp.remove(temp.size()-1);
            
        }
        
    }
    
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<List<Integer>> list=new ArrayList<>();
        combSum(list,new ArrayList<>(),k,n,1);
        return list;
        
        
    }
}