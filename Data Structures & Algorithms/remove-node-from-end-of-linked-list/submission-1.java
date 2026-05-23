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
        //calc len og ll
        ListNode curr = head;
        int len = 0;
        while(curr!=null){
            len++;
            curr=curr.next;
        }

        if(len == n){
            return head.next;
        }

        int N = len - n;
        curr = head;
        int ctr = 0;
        while(curr!=null){
            ctr++;
            if(ctr==N){
                curr.next = curr.next.next;
                return head;
            }
            curr = curr.next;
        }

        return head;
    }
}
