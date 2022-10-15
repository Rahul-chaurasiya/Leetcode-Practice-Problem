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

    public ListNode mergeNodes(ListNode head) {
        if (head == null) return head;
        ListNode fackNode = new ListNode(-1);
        ListNode tail = fackNode;
        ListNode curr = head.next;
        int sum = 0;
        while (curr != null) {
            if (curr.val == 0) {
                tail.next = new ListNode(sum);
                tail = tail.next;
                sum = 0;
            }
            sum += curr.val;
            curr = curr.next;
        }
        return fackNode.next;
    }

}