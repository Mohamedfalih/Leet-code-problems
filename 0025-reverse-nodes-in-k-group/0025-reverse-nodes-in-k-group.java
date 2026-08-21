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

    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode result = null;
        ListNode start = head;
        ListNode end = head;
        int count = 1;
        boolean flag = false;
        ListNode previous = null;

        while (end != null) {

            while (count < k) {
                if (end.next == null) {
                    flag = true;
                    break;
                }
                end = end.next;
                count++;
            }
            if (flag) {
                break;
            }

            ListNode temp = end.next;

            ListNode prePrev = null;
            ListNode prev = null;
            ListNode curr = start;

            while (curr != temp) {

                prev = curr;
                curr = curr.next;
                prev.next = prePrev;
                prePrev = prev;

            }
            
            if (previous == null) {
                result = prePrev;
            } else {
                previous.next = prePrev;
            }

            previous = start;

            start = temp;
            end = temp;

            count = 1;
        }

        if (previous != null) {
            previous.next = start;
        }

        return result;

    }
}