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
        

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode start = dummy;
        ListNode end = dummy;

        for(int i = 0 ; i <=n ; i++){
            end = end.next;
        }

        while(end != null){
            start = start.next;
            end = end.next;
        }

        start.next = start.next.next;

        return dummy.next;

    }
}

/* 
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
*/  