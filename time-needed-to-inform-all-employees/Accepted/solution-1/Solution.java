// https://leetcode.com/problems/time-needed-to-inform-all-employees

class Solution {
    class Employee{
        int time;
        int id;
        List<Integer> sub;
        Employee(int i,int t){
            id=i;
            time=t;
            sub=new ArrayList<>();
        }
    }
    public int numOfMinutes(int n, int headID, int[] manager, int[] time) {
        List<Employee> arr=new ArrayList<>();
        for(int i=0;i<n;i++) arr.add(new Employee(i,time[i]));
        Employee head=new Employee(headID,time[headID]);
        for(int i=0;i<n;i++){
            if(manager[i]==headID) head.sub.add(i);
            else if(i!=headID)
            arr.get(manager[i]).sub.add(i);
        }
        boolean[] isV=new boolean[n];
        Queue<Employee> q=new LinkedList<>();
        int[] dist=new int[n];
        q.add(head);
        isV[headID]=true;
        while(!q.isEmpty()){
            Employee e=q.poll();
            for(int i:e.sub){
                if(!isV[i])
                    dist[i]=dist[e.id]+e.time;
                isV[i]=true;
                q.add(arr.get(i));
            }
        }
        int max=Integer.MIN_VALUE;
        System.out.println(Arrays.toString(dist));
        for(int i:dist) max=Math.max(max,i);
        return max;
    }
}









