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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head.next == null) return null;


        int len = 0;
        ListNode temp = head;

        while(head != null){
            head = head.next;
            len++;
        }

        head = temp;
        if(len == n)  return head.next;
    

        int count = 1;
        while(count < len-n){
            
            temp = temp.next;
            count++;

        }

        temp.next = temp.next.next;

        return head;

    }
}