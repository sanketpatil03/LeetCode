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
    public ListNode removeNthFromEnd(ListNode head, int n)    {
        
        int size=0;
        ListNode temp=head;
        while(temp!=null)
        {
            
            size++;
            temp=temp.next; 
        }
        if(size==n)
        {
         head=head.next;
             return head;
        }
        int tofind=size-n;
        ListNode prev=head;
        for(int i=1;i<tofind;i++)
        {
            prev=prev.next;
        }
        prev.next=prev.next.next;
        return head;
    }
}