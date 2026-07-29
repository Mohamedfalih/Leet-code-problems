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

        ListNode newHead = new ListNode(head.val);
        ListNode copy = newHead;
        ListNode temp = head.next;

        while (temp != null) {
            copy.next = new ListNode(temp.val);
            copy = copy.next;
            temp = temp.next;
        }

        ListNode prePrev = null;
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {

            prev = curr;
            curr = curr.next;
            prev.next = prePrev;

            prePrev = prev;
        }

        while (newHead != null) {


            if(prev.val != newHead.val){
                return false;
            }
            prev = prev.next;
            newHead = newHead.next;
        }
        return true;
    }
}