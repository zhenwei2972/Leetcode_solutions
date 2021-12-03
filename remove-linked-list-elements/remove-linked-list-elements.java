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
    public ListNode removeElements(ListNode head, int val) {
    if(head ==null ) return null;
   
    while(head.val == val)
    {
        if(head.next!=null)
        {
            head = head.next;
        }
        else
        return null;
    }
     ListNode curr = head;
        
    //iteriate one at a time
    while(curr.next !=null)
    {
        
        if(curr.next.val == val)
        {
            //remove if node is problematic
            //get next next node
            curr.next  = curr.next.next;

        }
        else curr = curr.next;
        
        
    }
        return head;
        
    }
}