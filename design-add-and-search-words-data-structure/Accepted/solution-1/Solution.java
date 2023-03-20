// https://leetcode.com/problems/design-add-and-search-words-data-structure

class WordDictionary {
    class Node{
        Node[] a;
        boolean isEnd;
        Node(){
            a=new Node[26];
        }
    }
    Node root;
    public WordDictionary() {
        root=new Node();
    }
    
    public void addWord(String word) {
        Node curr=root;
        for(char c:word.toCharArray()){
            if(curr.a[c-'a']==null)
                curr.a[c-'a']=new Node();
            curr=curr.a[c-'a'];
        }
        curr.isEnd=true;
    }
    
    public boolean search(String word) {
        return f(word,0,root);
    }
    
    boolean f(String s,int i,Node curr){
        if(curr==null) return false;
        if(i==s.length()) return curr.isEnd;
        if(s.charAt(i)=='.'){
            for(int j=0;j<26;j++)
                if(f(s,i+1,curr.a[j])) return true;
            return false; 
        }
        return f(s,i+1,curr.a[s.charAt(i)-'a']);
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */