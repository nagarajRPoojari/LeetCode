// https://leetcode.com/problems/evaluate-division


class Solution {
    class Edge{
        String v;
        double w;
        Edge(String v,double w){
            this.v=v;
            this.w=w;
        }
    }
    void addEdge(Map<String,List<Edge>> map,String u,String v,double w){
        if(!map.containsKey(u)) map.put(u,new ArrayList<>());
        map.get(u).add(new Edge(v,w));
    }
    double dfs(Map<String,List<Edge>> map,String u,String v,Set<String> set){
        if(!map.containsKey(u) || !map.containsKey(v)) return -1;
        else if(u.equals(v)) return 1;
        for(Edge e:map.get(u)){
            if(set.contains(e.v)) continue;
            if(e.v.equals(v)) return e.w;
            set.add(u);
            double ans=dfs(map,e.v,v,set);
            if(ans!=-1) return e.w*ans;
        }
        return -1;
    }
    public double[] calcEquation(List<List<String>> e, double[] values, List<List<String>> q) {
        Map<String,List<Edge>> map=new HashMap<>();
        for(int i=0;i<e.size();i++){
            addEdge(map,e.get(i).get(0),e.get(i).get(1),values[i]);
            addEdge(map,e.get(i).get(1),e.get(i).get(0),1/values[i]);
        }
        double[] ans=new double[q.size()];
        for(int i=0;i<q.size();i++){
            ans[i]=dfs(map,q.get(i).get(0),q.get(i).get(1),new HashSet<>());
        }
        return ans;
    }
}



