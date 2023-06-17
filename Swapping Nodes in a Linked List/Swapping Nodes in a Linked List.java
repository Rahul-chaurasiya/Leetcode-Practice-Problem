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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode curr=head;
        int count=1;
        while(k-->1){
          curr=curr.next;      
        }
        ListNode first=curr;
        ListNode second=head;

        while(curr.next!=null){
          curr=curr.next;      
          second=second.next;
        }

        int temp=first.val;
        first.val=second.val;
        second.val=temp;
        return head;
    }
}
