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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode tmp = head;
        while(tmp != null){
            tmp = tmp.next;
            size++;
        }
        
        int prevPos = size - n - 1;
        if(prevPos+1 == 0) return head.next;
        
        tmp = head;
        while(prevPos > 0){
            tmp = tmp.next;
            prevPos--;
        }
        
        
        tmp.next = tmp.next.next;
        return head;
    }
}