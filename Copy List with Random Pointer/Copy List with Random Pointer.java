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

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node>hm = new HashMap<>();
        for(Node curr=head;curr!=null;curr=curr.next){
            hm.put(curr,new Node(curr.val));
        }

        for(Node curr=head;curr!=null;curr=curr.next){
            Node temp = hm.get(curr);
            temp.next = hm.get(curr.next);
            temp.random = hm.get(curr.random);
        }

        Node copy = hm.get(head);

        return copy;
    }
}
