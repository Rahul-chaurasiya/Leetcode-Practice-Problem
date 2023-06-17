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
    public int getDecimalValue(ListNode head) {
        int ans=0;
        ListNode curr = head;
        int count = 0;
        while(curr!=null){
            curr = curr.next;
            count++;
        }

        ListNode curr2 = head;
        while(curr2!=null){
            if(curr2.val == 1)
                ans += Math.pow(2,count-1);
            count--;
            curr2 = curr2.next;
        }
        return ans;
    }
}
