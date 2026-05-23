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
        //use an array, sort it in the array and converttoLL
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode curr = head;

        while(curr != null){
            arr.add(curr.val);
            curr = curr.next;
        }

        while(left<right){
            int temp = arr.get(left-1);
            arr.set(left-1, arr.get(right-1));
            arr.set(right-1, temp);
            left++;
            right--;
        }

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        for(int i=0; i<arr.size(); i++){
            temp.next = new ListNode(arr.get(i));
            temp = temp.next;
        }

        return dummy.next;


    }
}