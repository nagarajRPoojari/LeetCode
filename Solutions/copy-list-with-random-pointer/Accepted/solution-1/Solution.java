// https://leetcode.com/problems/copy-list-with-random-pointer

/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node,Node> map=new HashMap<>();
        for(Node curr=head;curr!=null;curr=curr.next)
            map.put(curr,new Node(curr.val));

        for(Node curr=head;curr!=null;curr=curr.next){
            Node c=map.get(curr);
            c.next=map.get(curr.next);
            c.random=map.get(curr.random);
        }
        return map.get(head);
    }
}