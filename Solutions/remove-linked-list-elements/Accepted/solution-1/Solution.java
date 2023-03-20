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
    static void remove(ListNode curr){      
        
        curr.next=curr.next.next;
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode fakehead=new ListNode(0,head);
        ListNode curr=fakehead;
        while(curr.next!=null){
            System.out.println(curr.val);
            while(curr.next!=null && curr.next.val==val){
                remove(curr); //removes curr.next
            }
            if(curr.next==null)
                break;

            curr=curr.next;
        }
        return fakehead.next;
    }
}