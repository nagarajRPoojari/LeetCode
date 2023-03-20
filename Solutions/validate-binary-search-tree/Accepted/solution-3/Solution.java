// https://leetcode.com/problems/validate-binary-search-tree

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
    TreeNode prev=null;
    boolean helper(TreeNode root){
        if(root==null) return true;
        boolean l=helper(root.left);
        if(!l) return false;
        boolean m=false;
        if(prev==null || prev.val<root.val){
            prev=root;
            m=true;
        }
        if(!m) return false;
        
        boolean r=helper(root.right);
        return l && m && r;
    }

    public boolean isValidBST(TreeNode root) {
        prev=null;
        return helper(root);
    }
}