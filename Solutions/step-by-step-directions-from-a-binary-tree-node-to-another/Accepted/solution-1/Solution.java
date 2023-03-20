// https://leetcode.com/problems/step-by-step-directions-from-a-binary-tree-node-to-another


class Solution {
    String start,dest;
    StringBuilder path;
    void findPath(TreeNode root,int s,int d){
        if(root==null) return;
        if(root.val==s) start=path.toString();
        else if(root.val==d) dest=path.toString();
        path.append('L');
        findPath(root.left,s,d);
        path.setCharAt(path.length()-1,'R');
        findPath(root.right,s,d);
        path.deleteCharAt(path.length()-1);
    }
    public String getDirections(TreeNode root, int s, int d) {
        start="";
        dest="";
        path=new StringBuilder();
        StringBuilder ans=new StringBuilder();
        findPath(root,s,d);
        int i=0;
        while(i<start.length() && i<dest.length() && start.charAt(i)==dest.charAt(i)) i++;
        for(int j=i;j<start.length();j++) ans.append('U');
        ans.append(dest.substring(i));
        return ans.toString();
    }
}