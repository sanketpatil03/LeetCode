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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head==null||head.next==null||k==0)
        {
            return head;
        }
        int size=1;
        ListNode curr=head;
        while(curr.next!=null)
        {
            size++;
            curr=curr.next;
        }
        curr.next=head;
        k=k%size;
        k=size-k;
        curr=head;
        while(k>1)
        {
            curr=curr.next;
            k--;
        }
        head=curr.next;
        curr.next=null;
        
        return head;
    }
}