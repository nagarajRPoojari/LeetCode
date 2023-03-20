// https://leetcode.com/problems/linked-list-cycle

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set=new HashSet<>();
        for(ListNode curr=head;curr!=null;curr=curr.next){
            if(set.contains(curr.next))
                return true;
            set.add(curr);
        }
        return false;
    }
}