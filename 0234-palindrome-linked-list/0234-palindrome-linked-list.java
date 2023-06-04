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
    public boolean isPalindrome(ListNode head) {
        if(head==null&&head.next==null)
        {
            return true;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            
        }
        ListNode middle=slow;
        ListNode prev=null;
        ListNode curr=middle;
        ListNode next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            
        }
        ListNode righthead=prev;
        ListNode lefthead=head;
        while(righthead!=null)
        {
            if(lefthead.val!=righthead.val)
            {
                return false;
            }
            lefthead=lefthead.next;
            righthead=righthead.next;
            
        }
        return true;
        
    }
}