// https://leetcode.com/problems/remove-nodes-from-linked-list

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
    public ListNode removeNodes(ListNode head) {
        ListNode curr=head;
        ArrayList<Integer> temp=new ArrayList<>();
        while(curr!=null){
            temp.add(curr.val);
            curr=curr.next;
        }
        
        
        Stack<Integer> s=new Stack<>();
        int[] arr=new int[temp.size()];
        
        
        for(int i=temp.size()-1;i>=0;i--){
            while(!s.isEmpty() && temp.get(s.peek())<=temp.get(i))
                s.pop();
            
            arr[i]=s.isEmpty()?-1:s.peek()-i;
            s.push(i);
        }
        
        ListNode dummy=new ListNode(0,head);
        curr=head;
        ListNode tail=dummy;
        int i=0;
        while(curr!=null){
            if(arr[i++]==-1){
                tail.next=curr;
                tail=curr;       
            }
            curr=curr.next;
        }
        tail.next=null;
        return dummy.next;
        
        
        
    }
}