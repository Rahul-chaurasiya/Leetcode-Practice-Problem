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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode curr = list1;
        ListNode curr2 = list1;
        ListNode ex = list2;
        for(int i=0;i<a-1;i++){
            curr = curr.next;
        }

        for(int i=0;i<b+1;i++){
            curr2 = curr2.next;
        }
        
        curr.next = list2;
        while(ex.next != null) ex = ex.next;
        ex.next = curr2;
        return list1;        
    }
}
