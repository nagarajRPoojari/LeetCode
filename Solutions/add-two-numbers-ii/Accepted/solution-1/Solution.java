// https://leetcode.com/problems/add-two-numbers-ii

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
        if(head==null || head.next==null)
            return head;
        ListNode curr=head,prev=null;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead=new ListNode(0);
        ListNode curr=dummyHead;
        int carry=0;

        l1=reverse(l1);
        l2=reverse(l2);

        while(l1!= null || l2!=null || carry!=0){
            int a=(l1==null)? 0:l1.val;
            int b=(l2==null)? 0:l2.val;
            int sum=(a+b+carry)%10;
            carry=(a+b+carry)/10;
            ListNode x=new ListNode(sum);
            curr.next=x;
            curr=x;

            l1=(l1==null)? null:l1.next;
            l2=(l2==null)? null:l2.next;
        
        }

        return reverse(dummyHead.next);
    }
}