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
    public static int gcd(int data1, int data2)
    {
        int Gcd=0;
        for(int i=1;i<=Math.min(data1,data2);i++)
        {
            if(data1%i==0 && data2%i==0)
            {
                Gcd=i;
            }
        }
        return Gcd;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
       ListNode curr=head;
        while(curr.next!=null)
        {
            ListNode node =new ListNode(gcd(curr.val,curr.next.val),curr.next);
            curr.next=node;
            curr=node.next;
        }
        return head;
    }
}