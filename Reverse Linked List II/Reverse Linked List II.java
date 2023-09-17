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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        left -= 1;
        right -= 1;
        List<Integer>list = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }

        while(left <= right){
            int t = list.get(left);
            list.set(left,list.get(right));
            list.set(right,t);
            left++;
            right--;
        }

        ListNode curr = head;
        for(int x : list){
            curr.val = x;
            curr = curr.next;
        }

        return head;
    }
}
