// https://leetcode.com/problems/odd-even-linked-list

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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null)   return head;
        
        ListNode eTail=head.next,oTail=head ,eHead=eTail;

        while(eTail!=null && eTail.next!=null){
            oTail.next=eTail.next;
            oTail=oTail.next;

            eTail.next=oTail.next;
            eTail=eTail.next;
        }

        oTail.next=eHead;
        return head;
    }
}