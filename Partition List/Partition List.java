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
    public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode(0);
        ListNode l = left;
        ListNode right = new ListNode(0);
        ListNode r = right;
        while(head!=null){
            if(head.val < x){
                ListNode temp = new ListNode(head.val);
                l.next = temp;
                l = l.next; 
            }else{
                ListNode temp = new ListNode(head.val);
                r.next = temp;
                r = r.next; 
            }
            head = head.next;
        }

        l.next = right.next;
        r.next = null;
        return left.next;
    }
}
