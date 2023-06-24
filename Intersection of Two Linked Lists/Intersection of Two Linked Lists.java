/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if(headA == null || headB == null) return null;

        ListNode h1 = headA;
        ListNode h2 = headB;

        int len1 = length(h1);
        int len2 = length(h2);

        if(len1 > len2){
            int len = len1 - len2;
            while(len-->0){
                h1 = h1.next;
            }
        }else{
            int len = len2 - len1;
            while(len-->0){
                h2 = h2.next;
            }
        }

        while(h1 != null){
            if(h1 == h2) return h1;
            h1 = h1.next;
            h2 = h2.next;
        }

        return h1;
    }

    public int length(ListNode head){
        ListNode curr = head;
        int count = 0;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        return count;
    }

}


===============================================================================================


public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if(headA == null || headB == null) return null;

        ListNode h1 = headA;
        ListNode h2 = headB;

        while(h1 != h2){
            h1 = h1 == null ? headB : h1.next;
            h2 = h2 == null ? headA : h2.next;
        }

        return h1;
    }
}
