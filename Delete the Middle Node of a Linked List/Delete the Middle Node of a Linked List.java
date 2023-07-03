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
    public ListNode deleteMiddle(ListNode head) {
        int len = 0;
        for(ListNode curr = head;curr!=null;curr=curr.next) len++;

        if(len==1){
            return null;
        }
        else if(len==2){
            head.next=null;
            return head;
        }
        
        ListNode temp=head;
        int mid;
        if(len%2==0){
            mid=(len/2)+1;
        }
        else{
            mid=(len-1)/2;
        }
		
        int i;
        if(len%2==0){
            i=1;
        }
        else{
            i=0;
        }

        while(i<mid){
            i++;
            temp = temp.next;
        }

        temp.val = temp.next.val;
        temp.next = temp.next.next;

        return head;
    }
}
