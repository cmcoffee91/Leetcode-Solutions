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
    public ListNode removeElements(ListNode head, int val) {
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        ListNode prev = dummy;
        ListNode tmp = head;
        
        while(tmp != null){
            if(tmp.val == val){
                prev.next = tmp.next;
            }
            else{
                prev = tmp;
            }
            tmp = tmp.next;
        }
        
        return dummy.next;
    }
}