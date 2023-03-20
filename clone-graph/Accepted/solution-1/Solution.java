// https://leetcode.com/problems/clone-graph

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    Node dfs(Node node,Map<Node,Node> map){
        if(node==null) return null;
        Node root=new Node(node.val);
        map.put(node,root);
        for(Node c:node.neighbors){
            if(!map.containsKey(c)){
                root.neighbors.add(dfs(c,map));
            }
            else root.neighbors.add(map.get(c));
        }
        return root;
    }


    public Node cloneGraph(Node node) {
        return dfs(node,new HashMap<>());
    }
}