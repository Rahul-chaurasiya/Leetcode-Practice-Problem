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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr = head;
        while(curr.next != null){
            int a = curr.val;
            int b = curr.next.val;
            int divisor = gcd(a,b);
            ListNode temp = new ListNode(divisor);
            temp.next = curr.next;
            curr.next = temp;
            curr = curr.next.next;
        }
        return head;
    }

    public int gcd(int a,int b){
        if(a == 0)
            return b;
        return gcd(b%a, a);
    }
}                                   // recurrsion fast h  
