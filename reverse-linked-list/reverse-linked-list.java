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
    public ListNode reverseList(ListNode head) {
        // 0->1->2->3->4->5->6
        // 0<-1<-2<-3<-4<-5<-6
        if(head ==null) return null;
        ListNode currNode =head;
        ListNode previousNode = null;
        ListNode nextNode =null;
        while(currNode.next!=null)
        {

            nextNode= currNode.next;
            currNode.next = previousNode;
            previousNode = currNode;
            currNode = nextNode;
        }
        currNode.next = previousNode;
        return currNode;
    }
}