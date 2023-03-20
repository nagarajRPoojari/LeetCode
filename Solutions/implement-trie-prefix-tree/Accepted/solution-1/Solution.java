// https://leetcode.com/problems/implement-trie-prefix-tree

class Trie {
    class Node{
        Node[] a;
        boolean isEnd;
        Node(){
            a=new Node[26];
        }
    }
    Node root;
    public Trie() {
        root=new Node();
    }
    
    public void insert(String word) {
        Node curr=root;
        for(char c:word.toCharArray()){
            if(curr.a[c-'a']==null)
                curr.a[c-'a']=new Node();
            curr=curr.a[c-'a'];
        }
        curr.isEnd=true;
    }
    
    public boolean search(String word) {
        Node curr=root;
        for(char c:word.toCharArray()){
            if(curr.a[c-'a']==null)
                return false;
            curr=curr.a[c-'a'];
        }
        return curr.isEnd;
    }
    
    public boolean startsWith(String prefix) {
        Node curr=root;
        for(char c:prefix.toCharArray()){
            if(curr.a[c-'a']==null)
                return false;
            curr=curr.a[c-'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */