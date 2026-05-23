/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
//1 pass , hash map solution

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> oldToCopy = new HashMap<>();

        Node curr = head;

        while(curr!=null){

            oldToCopy.putIfAbsent(curr, new Node(curr.val));

            Node copy = oldToCopy.get(curr);

            if(curr.next != null){
                oldToCopy.putIfAbsent(curr.next, new Node(curr.next.val));
                copy.next = oldToCopy.get(curr.next);
            }

            if(curr.random != null){
                oldToCopy.putIfAbsent(curr.random, new Node(curr.random.val));
                copy.random = oldToCopy.get(curr.random);
            }

            curr = curr.next;
            
        }

        return oldToCopy.get(head);

    }
}
