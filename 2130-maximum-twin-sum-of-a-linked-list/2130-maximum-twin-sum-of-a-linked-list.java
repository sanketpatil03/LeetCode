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
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        int twin=0;
        int maxTwin=0;
        if(head.next.next==null)
        {
            maxTwin=head.val+head.next.val;
            return maxTwin;
        }
        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
       ListNode prev=null;
        ListNode curr=slow;
        ListNode next;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode rightHead=prev;
        ListNode leftHead=head;
        while(rightHead!=null)
        {
            twin=leftHead.val+rightHead.val;
            maxTwin=Math.max(twin,maxTwin);
            leftHead=leftHead.next;
            rightHead=rightHead.next;
        }
    
        
        
        return maxTwin;
    }
}