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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       
        ListNode mergeList=new ListNode(-1);
        ListNode mergetemp=mergeList;
        while(list1!=null&&list2!=null)
        {
            if(list1.val<=list2.val)
            {
                mergetemp.next=list1;
                list1=list1.next;
                mergetemp=mergetemp.next;
                
            }
            else{
               mergetemp.next=list2;
                list2=list2.next;
                mergetemp=mergetemp.next;
                
            }
        }
        while(list1!=null)
        {
            mergetemp.next=list1;
                list1=list1.next;
                mergetemp=mergetemp.next;
        }
        while(list2!=null)
        {
            mergetemp.next=list2;
                list2=list2.next;
                mergetemp=mergetemp.next;
        }
        return mergeList.next;
        
    }
}