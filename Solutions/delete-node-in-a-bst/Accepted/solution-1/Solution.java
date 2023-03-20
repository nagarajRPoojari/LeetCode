// https://leetcode.com/problems/delete-node-in-a-bst


class Solution {
    static TreeNode helper(TreeNode root){
        TreeNode curr=root.right;
        while(curr!=null && curr.left!=null) curr=curr.left;
        return curr;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(root.val>key) root.left=deleteNode(root.left,key);
        else if(root.val<key) root.right=deleteNode(root.right,key);
        else{
            if(root.left==null) return root.right;
            else if(root.right==null) return root.left;
            else{
                TreeNode x=helper(root);
                root.val=x.val;
                root.right=deleteNode(root.right,x.val);
            }
        }
        return root;
    }
}