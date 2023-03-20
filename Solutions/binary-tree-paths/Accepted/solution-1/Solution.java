// https://leetcode.com/problems/binary-tree-paths

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static List<String> ans;
    static void helper(TreeNode root,String temp){
        if(root==null) return;
        if(root.left==null && root.right==null){
            temp+=root.val;
            ans.add(temp);
            temp=temp.substring(0,temp.length()-1);
            return;
        }
        temp+=root.val+"->";
        helper(root.left,temp);
        helper(root.right,temp);
        temp=temp.substring(0,temp.length()-3);
        
    }
    public List<String> binaryTreePaths(TreeNode root) {
        ans=new ArrayList<>();
        helper(root,new String());
        return ans;
    }
}