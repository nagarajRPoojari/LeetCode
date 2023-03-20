// https://leetcode.com/problems/employee-importance

/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> e, int id) {
        Map<Integer,Employee> map=new HashMap<>();
        for(Employee i:e)
            map.put(i.id,i);
        Queue<Employee> q=new LinkedList<>();
        int ans=0;
        q.add(map.get(id));
        while(!q.isEmpty()){
            Employee i=q.poll();
            ans+=i.importance;
            for(int s:i.subordinates){
                q.add(map.get(s));
            }
        }
        return ans;
    }
}