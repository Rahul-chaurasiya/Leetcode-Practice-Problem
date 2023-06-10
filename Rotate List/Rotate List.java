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
    public ListNode rotateRight(ListNode head, int k) {
       if (head == null || head.next == null || k == 0)
            return head;

        ArrayList<Integer> values = new ArrayList<>();
        ListNode current = head;

        // Store the values of the linked list in an ArrayList
        while (current != null) {
            values.add(current.val);
            current = current.next;
        }

        int size = values.size();
        k = k % size;

        if (k == 0) return head;

        ListNode newHead = new ListNode(values.get(size - k));
        current = newHead;

        for (int i = size - k + 1; i < size; i++) {
            current.next = new ListNode(values.get(i));
            current = current.next;
        }

        for (int i = 0; i < size - k; i++) {
            current.next = new ListNode(values.get(i));
            current = current.next;
        }

        return newHead;
    }
}
