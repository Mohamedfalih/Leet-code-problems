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

        if (head == null || head.next == null)
            return true;

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode prePrev = null;
        ListNode prev = null;
        ListNode curr = slow.next;

        while (curr != null) {

            prev = curr;
            curr = curr.next;
            prev.next = prePrev;

            prePrev = prev;
        }

        ListNode ptr1 = head;
        ListNode ptr2 = prev;

        while (ptr2 != null) {

            if (ptr2.val != ptr1.val) {
                return false;
            }
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        return true;
    }
}