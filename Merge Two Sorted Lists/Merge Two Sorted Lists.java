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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode temp = new ListNode(0);
        ListNode ans = temp;

        while(list1 != null && list2 != null){

            if(list1.val < list2.val){
                ans.next = list1;
                list1 = list1.next;
            }

            else{
                ans.next = list2;
                list2 = list2.next;
            }

            ans = ans.next;
        }

        if(list1 == null)ans.next = list2;
        else ans.next = list1;

        return temp.next;
        
    }
}


====================================================================================


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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        while(list1 != null && list2 != null){

            if(list1.val < list2.val){
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            }

            else{
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            }
        }

        if(list1 == null)return list2;
        else return list1;      
    }
}
