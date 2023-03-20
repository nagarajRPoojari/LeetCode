// https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    TreeNode helper(TreeMap<Integer,ListNode> map,int is,int ie){
        if(is>ie) return null;
        int i=(is+ie)/2;
        TreeNode root=new TreeNode(map.get(i).val);
        root.left=helper(map,is,i-1);
        root.right=helper(map,i+1,ie);
        return root;
    }
    public TreeNode sortedListToBST(ListNode head) {
        TreeMap<Integer,ListNode> map=new TreeMap<>();
        int i=0;
        for(ListNode curr=head;curr!=null;curr=curr.next) map.put(i++,curr);
        return helper(map,0,i-1);
    }
}