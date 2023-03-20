// https://leetcode.com/problems/merge-k-sorted-lists

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
    static boolean isArrayNull(ListNode[] arr){
        for(ListNode x:arr)
            if(x!=null) return false;
        return true;
    }
    public ListNode mergeKLists(ListNode[] arr) {
        if(arr.length==0) return null;
        if(isArrayNull(arr)) return null;

        ListNode head=null,tail=null ;
        ListNode minNode=null;
        int min=Integer.MAX_VALUE;
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=null  &&  arr[i].val<min){
                index=i;
                minNode=arr[i];
                min=arr[i].val;
            }
        }
        head=tail=minNode;
        arr[index]=arr[index].next;

        while(!isArrayNull(arr)){
            min=Integer.MAX_VALUE;
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=null && arr[i].val<min){
                    index=i;
                    minNode=arr[i];
                    min=arr[i].val; 
                }
            }
            tail.next=minNode;
            tail=minNode;
            arr[index]=arr[index].next;
        }

        return head;

    }
}