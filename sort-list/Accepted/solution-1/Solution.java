// https://leetcode.com/problems/sort-list

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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(ListNode curr=head;curr!=null;curr=curr.next)
            arr.add(curr.val);
        Collections.sort(arr);
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        for(int n:arr){
            curr.next=new ListNode(n);
            curr=curr.next;
        }
        curr.next=null;
        return dummy.next;

    }
}