// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        Stack<TreeNode> s1=new Stack<>();
        Stack<TreeNode> s2=new Stack<>();
        s1.push(root);

        while(!s1.empty() || !s2.empty()){
            List<Integer> t1=new ArrayList<>();
            boolean isEmpty=s1.empty();
            while(!s1.empty()){
                TreeNode curr=s1.pop();
                t1.add(curr.val);
                if(curr.left!=null) s2.push(curr.left);
                if(curr.right!=null) s2.push(curr.right);
            }
            if(!isEmpty);
            ans.add(t1);
            List<Integer> t2=new ArrayList<>();
            isEmpty=s2.empty();
            while(!s2.empty()){
                TreeNode curr=s2.pop();
                t2.add(curr.val);
                if(curr.right!=null) s1.push(curr.right);
                if(curr.left!=null) s1.push(curr.left);
            }
            if(!isEmpty)
            ans.add(t2);


        }
        
        return ans;

    }
}