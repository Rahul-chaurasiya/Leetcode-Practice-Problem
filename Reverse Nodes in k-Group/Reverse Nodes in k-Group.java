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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        int count = 0;
        int size = 0;
        for(ListNode c = head;c!=null;c=c.next)size++;

        if(size < k){
            return head;
        }

        while(curr != null&&count < k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
            size -= k;
        }
        
        if(next!=null){
            head.next = reverseKGroup(next,k);
        }

        return prev;
    }
}
