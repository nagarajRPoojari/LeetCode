// https://leetcode.com/problems/swapping-nodes-in-a-linked-list

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
class Solution {
    
    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast=head,slow=head;

        ListNode a=null,b=null;
        for(int i=0;i<k-1;i++){
            fast=fast.next;
        }
        a=fast;
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        b=slow;

        int temp=a.val;
        a.val=b.val;
        b.val=temp;

        return head;

    }
}