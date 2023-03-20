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
    static ListNode mergeSort(ListNode[] arr,int l,int h){
        if(l<h){
            int mid=(l+h)/2;
            ListNode l1=mergeSort(arr,l,mid);
            ListNode l2=mergeSort(arr,mid+1,h);
            return mergeTwoList(l1,l2);
        }
        return arr[l];
    }
    static ListNode mergeTwoList(ListNode a,ListNode b){
        if(a==null) return b;
        if(b==null) return a;
        if(a==b) return a;

        ListNode head=null,tail=null;
        if(a.val<=b.val){
            head=tail=a;
            a=a.next;
        }else{
            head=tail=b;
            b=b.next;
        }
        while(a!=null && b!=null){
            if(a.val<=b.val){
                tail.next=a;
                tail=a;
                a=a.next;
            }else{
                tail.next=b;
                tail=b;
                b=b.next;
            }
        }
        if(a==null) tail.next=b;
        else tail.next=a;
        return head;
    }

    public ListNode mergeKLists(ListNode[] arr) {
        if(arr.length==0) return null;
        return mergeSort(arr,0,arr.length-1);
    }
}


/*class Solution {
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
}*/