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
    public int numComponents(ListNode head, int[] nums) {
        List<Integer>l = new ArrayList<>();
        for(int x:nums){
            l.add(x);
        }

        int count = 0;
        int consecutiveCount = 0;

        while(head != null) {
            if (l.contains(head.val)) {
                consecutiveCount++;
            } else {
                if (consecutiveCount > 0) {
                    count++;
                }
                consecutiveCount = 0;
            }
            head = head.next;
        }

        count += consecutiveCount > 0 ? 1 : 0;

        return count;
    }
}


===========================================================================================


class Solution {
    public int numComponents(ListNode head, int[] nums) {
        List<Integer>l = new ArrayList<>();
        for(ListNode curr = head;curr != null; curr=curr.next){
            l.add(curr.val);
        }

        for(int i=0;i<nums.length;i++){
            if(l.contains(nums[i])){
                int x = l.indexOf(nums[i]);
                l.remove(x);
                l.add(x, -1);
            }
        }

        int count = 0;
        int consecutiveCount = 0;

        for (int num : l) {
            if (num == -1) {
                consecutiveCount++;
            } else {
                if (consecutiveCount > 0) {
                    count++;
                }
                consecutiveCount = 0;
            }
        }

        count += consecutiveCount > 0 ? 1 : 0;

        return count;
    }
}
