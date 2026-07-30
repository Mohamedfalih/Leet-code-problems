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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(head == null || head.next == null) return head;

        ListNode leftNode = head;
        ListNode first = null;

        while(left != 1){
            first = leftNode;
            leftNode = leftNode.next;
            left--;
        }

        ListNode rightNode = head;

        while(right != 1){
            rightNode = rightNode.next;
            right--;

        }
        ListNode last = rightNode.next;

        ListNode curr = leftNode;
        ListNode prev = null;
        ListNode prePrev = null;

        while(curr != last){
            
            prev = curr;
            curr = curr.next;
            prev.next = prePrev;
            prePrev = prev;

        }
        if(first != null)
            first.next = prev;
        else
            head = prev;

        leftNode.next = last;

        return head;
    }
}