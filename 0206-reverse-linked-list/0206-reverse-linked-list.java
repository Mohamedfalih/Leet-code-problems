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
        
        ListNode prev = null;
        ListNode prevPrev = null;
        ListNode current = head;

        while(current != null){

            prev = current;
            current = current.next;
            prev.next = prevPrev;

            prevPrev = prev;
        }

        return prevPrev;
    }
}