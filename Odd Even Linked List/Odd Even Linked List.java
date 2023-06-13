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
    public ListNode oddEvenList(ListNode head) {
        ListNode eS=null,eE=null,oS=null,oE=null;
        int x=0;
        for(ListNode curr=head;curr!=null;curr=curr.next){
            if(x%2==0){
                if(eS==null){
                    eS=curr;
                    eE=eS;
                }else{
                    eE.next=curr;
                    eE=eE.next;
                }
            }else{
                if(oS==null){
                    oS=curr;
                    oE=oS;
                }else{
                    oE.next=curr;
                    oE=oE.next;
                }
            }
            x++;
        }
        if(oS==null||eS==null)
            return head;
        eE.next=oS;
        oE.next=null;
        return eS;
    }
}
