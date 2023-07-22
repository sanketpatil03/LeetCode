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
    public int[] nextLargerNodes(ListNode head) {
        Stack <Integer> stack=new Stack<>();
        ArrayList<Integer> ls=new ArrayList<>();
       while(head!=null)
       {
           ls.add(head.val);
           head=head.next;
           
       }
        int arr[]=new int[ls.size()];
        for(int i=ls.size()-1;i>=0;i--)
        {
            while(!stack.isEmpty()&&stack.peek()<=ls.get(i))
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                arr[i]=0;
            }else{
                arr[i]=stack.peek();
            }
            stack.push(ls.get(i));
        }
        return arr;
    }
}