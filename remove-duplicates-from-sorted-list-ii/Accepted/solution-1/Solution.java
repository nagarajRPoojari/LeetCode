// https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii

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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode fakeHead=new ListNode(0,head);
        ListNode tail=fakeHead;
        ListNode curr=head;
        while(curr!=null){
            if(curr.next!=null && curr.val==curr.next.val){
                while(curr.next!=null && curr.val==curr.next.val)
                    curr=curr.next;
                tail.next=curr.next;
            }
            else
                tail=tail.next;
            curr=curr.next;
        }
        return fakeHead.next;
    }

}