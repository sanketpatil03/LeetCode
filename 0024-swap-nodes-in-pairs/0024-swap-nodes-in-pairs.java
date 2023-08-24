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
    public static ListNode tt=null;
    public static ListNode th=null;
    public static int length(ListNode node)
    {
        ListNode temp=node;
        int size=0;
        while(temp!=null)
        {
            temp=temp.next;
            size++;
        }
        return size;
    }
    public static void addFirst(ListNode node)
    {
        if(th==null)
        {
            th=tt=node;
        }
        else{
            node.next=th;
            th=node;
        }
    }
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null)
        {
            return head;
        }
        ListNode curr=head;
        ListNode ot=null;
        ListNode oh=null;
        int len=length(head);
        int k=2;
        while(len>=2)
        {
            int tempk=k;
            while(tempk-->0)
            {
                ListNode frow=curr.next;
                curr.next=null;
                addFirst(curr);
                curr=frow;
            }
            if(oh==null)
            {
                oh=th;
                ot=tt;
            }else{
                ot.next=th;
                ot=tt;
            }
            th=null;
            tt=null;
            len-=k;
        }
        ot.next=curr;
        return oh;
    }
}