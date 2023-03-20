// https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal

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
    static int postIndex;
    static TreeNode creat(int[] in,int[] post,int is,int ie){
        if(is>ie) return null;
        TreeNode root=new TreeNode(post[postIndex--]);
        int inIndex=is;
        for(int i=0;i<=ie;i++){
            if(in[i]==root.val){
                inIndex=i;
                break;
            }
        }
        root.right=creat(in,post,inIndex+1,ie);
        root.left=creat(in,post,is,inIndex-1);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex=postorder.length-1;
        return creat(inorder,postorder,0,inorder.length-1);
    }
}