// https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal

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
    static int preIndex=0;
    static TreeNode creat(int[] in,int[] pre,int is,int ie){
        if(is>ie) return null;
        TreeNode root=new TreeNode(pre[preIndex++]);
        int inIndex=is;
        for(int i=0;i<=ie;i++){
            if(in[i]==root.val){
                inIndex=i;
                break;
            }
        }
        root.left=creat(in,pre,is,inIndex-1);
        root.right=creat(in,pre,inIndex+1,ie);
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        preIndex=0;
        return creat(inorder,preorder,0,inorder.length-1);
    }
}






