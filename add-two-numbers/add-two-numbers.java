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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        int carry = 0;
        
        while(l1 != null || l2 != null){
            int one = l1 != null ? l1.val : 0;
            int two = l2 != null ? l2.val : 0;
            int sum = carry + one + two;
            current.next = new ListNode(sum%10);
            carry = sum/10;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
            current = current.next;
        }
        
        if(carry > 0) current.next = new ListNode(carry);
        
        return dummy.next;
    }
}