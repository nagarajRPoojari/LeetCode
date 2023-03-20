// https://leetcode.com/problems/reverse-nodes-in-k-group

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
    static int getCount(ListNode head){
        int count=0;
        for(ListNode curr=head;curr!=null;curr=curr.next)
            count++;
        return count;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr=head,prevFirst=null;

        int length=getCount(head);

        int outCount=0;

        boolean isFirst=true;
        while(curr!=null && outCount<=length-k ){
            ListNode first=curr,prev=null;
            int count=0;
            while(curr!=null && count<k ){
                ListNode Next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=Next;
                count++;
                outCount++;
            }



            if(isFirst){
                head=prev;
                isFirst=false;
            }
            else
                prevFirst.next=prev;
            
            prevFirst=first;

            
        }
        if(prevFirst!=null)
        prevFirst.next=curr;


        return head;
    }
}