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
        ListNode slow = head;
        ListNode fast = head.next;
        
        ListNode next = head.next;
        ListNode prev = null;
        
        //iteriate fast pointer 
        while(fast!=null && fast.next !=null)
        {
            //slow will be set to previous (null)
            slow.next = prev;
            //prev set to current slow, which is at head
            prev = slow;
            //slow then updated to move to next ( traverse by 1)
            slow = next;
            //next at same pos at slow, traverse by 1. 
            next = next.next;
            //fast traverse by 2
            fast = fast.next.next;
        }
        //slow is then set to prev ( which is currently at pos 1)
        slow.next = prev;
        // iteriate slow if fast is already at null.
        if (fast == null) slow = slow.next;
        //next is always 1 head of slow, hence we iteriate it 
        while (next != null) {
            //in the case that next does not match with slow, return false, because next needs to match. 
            if (slow.val != next.val) return false;
            //iteriate both slow and next which are in the correct directions already. 
            slow = slow.next;
            next = next.next;
        }
        
        return true;  
    }
}