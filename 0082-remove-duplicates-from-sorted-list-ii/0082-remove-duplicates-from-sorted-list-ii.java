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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null|| head.next==null)
        {
            return head;
        }
        ListNode dummy=new ListNode(0);
        ListNode itr=dummy;
        itr.next=head;
        ListNode curr=head.next;
        while(curr!=null)
        {
            boolean isLoopRun=false;
            while(curr!=null && itr.next.val==curr.val)
            {
                curr=curr.next;
                isLoopRun=true;
            }
            if(isLoopRun)
            {
                itr.next=curr;
            }
            else{
                itr=itr.next;
                
            }
            if(curr!=null)
            {
                 curr=curr.next;
            }
           
        }
        return dummy.next;
    }
}