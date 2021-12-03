/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        int pos = -1;
       // ListNode curr = head;
        // floyd hare algorithm
        // fast and slow pointer to find mid or cycle.
       if(head ==null || head.next== null) return false;
        ListNode slow = head;
        ListNode fast = head.next;
                //if one node or no node. cannot have cycle  
     
    
        // if fast pointer can iteriate and match slow pointer, there exist a cycle.
        while(fast !=null && fast.next !=null)

        {
            if(fast == slow) return true;
            slow = slow.next;
            fast = fast.next.next;
        }

        return false;
    }
}