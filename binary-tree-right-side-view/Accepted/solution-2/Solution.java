// https://leetcode.com/problems/binary-tree-right-side-view

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
    int max=0;
    List<Integer> ans=new ArrayList<>();
    void helper(TreeNode root,int level){
        if(root==null) return;
        if(level>max){
            ans.add(root.val);
            max=level;
        }
        helper(root.right,level+1);
        helper(root.left,level+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null) return ans;
        helper(root,1);
        return ans;
    }
}