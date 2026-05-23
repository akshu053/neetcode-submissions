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
        int len = 0;
        ListNode curr = head;

        while(curr!=null){
            len++;
            curr = curr.next;
        }
        if(len == n){
            return head.next;
        }

        int ctr = 0;
        ListNode temp = head;
        while(temp!=null){
            ctr++;
            if(ctr == len-n){
                temp.next = temp.next.next;
                break;
            }
            
            temp = temp.next;
        }

        return head;
    }
}
