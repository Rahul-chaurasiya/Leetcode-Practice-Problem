
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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] arr = new ListNode[k];
        if (head == null)
            return arr;
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        int parts = size / k;
        int extra = size % k;
        temp = head;

        for (int i = 0; i < k; i++) {
            ListNode partHead = new ListNode(-1);
            ListNode partCurrent = partHead;

            for (int j = 0; j < parts; j++) {
                if (temp != null) {
                    partCurrent.next = new ListNode(temp.val);
                    partCurrent = partCurrent.next;
                    temp = temp.next;
                }
            }

            if (extra > 0 && temp != null) {
                partCurrent.next = new ListNode(temp.val);
                partCurrent = partCurrent.next;
                temp = temp.next;
                extra--;
            }

            arr[i] = partHead.next;
        }

        return arr;
    }
}
