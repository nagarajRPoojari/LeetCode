// https://leetcode.com/problems/combinations

class Solution {
    static void combination(List<List<Integer>> list,ArrayList<Integer> temp,int n,int k,int index){
        if(temp.size()==k)
        {
            list.add(new ArrayList<>(temp));
        }
        
        for(int i=index;i<=n;i++){
            temp.add(i);
            combination(list,temp,n,k,i+1);
            temp.remove(temp.size()-1);
        }
    }
    
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list=new ArrayList<>();
        combination(list,new ArrayList<>(),n,k,1);
        return list;
    }
}