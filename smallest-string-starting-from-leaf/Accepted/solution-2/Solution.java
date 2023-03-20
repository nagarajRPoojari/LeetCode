// https://leetcode.com/problems/smallest-string-starting-from-leaf

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
    String ans;
    void helper(TreeNode root,StringBuilder temp){
        if(root==null) return;
        temp.append((char)(root.val+'a'));
        if(root.left==null && root.right==null){
            temp.reverse();
            String s=temp.toString();
            temp.reverse();
            if(s.compareTo(ans)<0) ans=s;
        }
        helper(root.left,temp);
        helper(root.right,temp);
        temp.deleteCharAt(temp.length()-1);
        
    }
    public String smallestFromLeaf(TreeNode root) {
        ans="~";
        helper(root,new StringBuilder());
        return ans; 
    }
}