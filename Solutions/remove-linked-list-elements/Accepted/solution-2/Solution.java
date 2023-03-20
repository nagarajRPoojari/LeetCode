// https://leetcode.com/problems/remove-linked-list-elements

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
    

    public ListNode removeElements(ListNode head, int val) {
        ListNode fakehead=new ListNode(0,head);
        ListNode curr=head;
        ListNode tail=fakehead;

        while(curr!=null){      
            if(curr.val==val){
                curr=curr.next;
                tail.next=curr;
                
            }else{
                tail=tail.next;
                curr=curr.next;
            }     
        }
        
        return fakehead.next;
    }
}