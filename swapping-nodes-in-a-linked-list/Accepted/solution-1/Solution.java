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
    static int getLength(ListNode head){
        int count=0;
        for(ListNode curr=head;curr!=null;curr=curr.next) count++;
        return count;
    }
    public ListNode swapNodes(ListNode head, int k) {
        int pos=0;
        int len=getLength(head);

        k=Math.min(k,len-k+1);

        ListNode a=null,b=null;
        for(ListNode curr=head;curr!=null;curr=curr.next){
            pos++;
            if(pos==k) a=curr;
            if(pos==len-k+1){
                b=curr;
                break;
            }
        }
        int temp=a.val;
        a.val=b.val;
        b.val=temp;

        return head;

    }
}