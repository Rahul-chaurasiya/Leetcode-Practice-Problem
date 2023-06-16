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
    ListNode curr;
    public Solution(ListNode head) {
        this.curr=head;
    }
    
    public int getRandom() {
        ListNode curr=this.curr;;
        int ans=0,i=1;
        while(curr!=null){
            if(Math.random()<1.0/i){
                ans=curr.val;
            }
            i++;
            curr=curr.next;
        }
        return ans;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
