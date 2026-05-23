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
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode curr = head;
        ListNode lprev = dummy;

        for(int i=0; i<left-1; i++){
            lprev = curr;
            curr = curr.next;
        }

        ListNode prev = null; //atp curr is at left index
        for(int i=0; i<right-left+1; i++){ 
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        lprev.next.next = curr;
        lprev.next = prev;

        return dummy.next;

    }
}