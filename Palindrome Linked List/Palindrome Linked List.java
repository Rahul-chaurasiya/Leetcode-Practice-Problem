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
    public boolean isPalindrome(ListNode head) {
        Deque<Integer>d=new ArrayDeque<>();
        for(ListNode curr=head;curr!=null;curr=curr.next){
            d.push(curr.val);
        }

        for(ListNode curr=head;curr!=null;curr=curr.next){
            if(d.pop()!=curr.val) return false;
        }

        return true;
    }
}


================================================================================================


class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode rev = reverse(slow.next);

        ListNode curr = head;
        while(rev != null){
            if(rev.val != curr.val) return false;
            rev = rev.next;
            curr = curr.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
