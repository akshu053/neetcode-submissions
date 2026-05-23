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
//traverse ll1->put in arraylist, traverse ll2-> put in arraylist
//arrays.sort(arraylist)
//convert arraylist to ll
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        List<Integer> arr = new ArrayList<>();

        while(list1 != null){
            arr.add(list1.val);
            list1 = list1.next;
        }

        while(list2 != null){
            arr.add(list2.val);
            list2 = list2.next;
        }

        Collections.sort(arr);

        return convertArrToLL(arr);
    }

    public ListNode convertArrToLL(List<Integer> arr){
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        for(int i=0; i<arr.size(); i++){
            temp.next = new ListNode(arr.get(i));
            temp = temp.next;
        }

        return dummy.next;

    }
}