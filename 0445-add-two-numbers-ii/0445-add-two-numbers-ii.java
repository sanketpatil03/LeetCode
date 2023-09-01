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
    public static ListNode reverseList(ListNode head)
    {
        ListNode prev=null;
        ListNode cur=head;
        ListNode next;
        while(cur!=null)
        {
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
        
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        int carry=0;
        ListNode list1=reverseList(l1);
        ListNode list2=reverseList(l2);
        while(list1!=null || list2!=null || carry!=0)
        {
             int x= (list1!=null) ? list1.val : 0;
            int y= (list2!=null) ? list2.val : 0;
            int sum=x+y+carry;
            carry=sum/10;
            curr.next=new ListNode(sum%10);
            curr=curr.next;
            if(list1!=null)
            {
                list1=list1.next;
                
            }
            if(list2!=null)
            {
                list2=list2.next;
            }
        }
        
         ListNode newHead=reverseList(dummy.next);
        return newHead;
    }
}