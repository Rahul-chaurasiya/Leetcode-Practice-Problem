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
    public ListNode removeZeroSumSublists(ListNode head) {
       ListNode dummy=new ListNode(0);
        HashMap<Integer,ListNode>map=new HashMap<>();
        map.put(0,dummy);
        int prefixSum=0;
        dummy.next=head;
        while(head!=null){
            prefixSum+=head.val;
            if(!map.containsKey(prefixSum)){
                map.put(prefixSum,head);
            }else {
                ListNode start=map.get(prefixSum);
                ListNode curr=start;
                int sum=prefixSum;

                while(curr!=head){
                    curr=curr.next;
                    sum+=curr.val;
                    if(curr!=head) map.remove(sum);
                }
                start.next=head.next;
            }
            head=head.next;
        }
        return dummy.next;
    }
}
