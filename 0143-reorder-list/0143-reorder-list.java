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
    public void reorderList(ListNode head) {
        
        //Part 1 => Finding middle element

        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

        }

        //Part 2 => Reverse the second half

        ListNode prePrev = null;
        ListNode prev = null;
        ListNode curr = slow.next;
        slow.next = null;   

        while(curr != null){

            prev = curr;
            curr = curr.next;
            prev.next = prePrev;
            prePrev = prev;

        }

        //Part 3 => Merge based on condition

        ListNode p1 = head;
        ListNode p2 = prePrev;
       

        while(p2 != null){

            ListNode p1Temp = p1.next;
            p1.next = p2;
            p1 = p1Temp;

            ListNode p2Temp = p2.next;
            p2.next = p1;
            p2 = p2Temp;

        }

    }
}