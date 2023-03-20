// https://leetcode.com/problems/reorder-list

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
    static ListNode reverse(ListNode head){
        ListNode curr=head,prev=null;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        if(head==null || head.next==null)
            return;
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode a=head;
        ListNode b=reverse(slow.next);
        slow.next=null;

        while(a!=null && b!=null){
            ListNode tempA=a.next;
            ListNode tempB=b.next;
            a.next=b;
            b.next=tempA;

            a=tempA;
            b=tempB;

        }



    }
}









