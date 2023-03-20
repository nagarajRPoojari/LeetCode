// https://leetcode.com/problems/remove-nth-node-from-end-of-list

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
    public ListNode removeNthFromEnd(ListNode head, int n){
        if(head==null || head.next==null) return null;
        ListNode dummy=new ListNode(0,head);
        ListNode slow=dummy,fast=dummy;
        int count=0;
        while(count<=n){
            fast=fast.next;
            count++;
        }
        ListNode prev=null;
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
    }
}

































































































































