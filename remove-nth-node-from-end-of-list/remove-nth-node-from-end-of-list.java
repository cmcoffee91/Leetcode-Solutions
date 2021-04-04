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
        
        if(head == null) return head;
        
        int length = 0;
        ListNode tmp = head;
        while(tmp != null){
            tmp = tmp.next;
            length++;
        }
        
        tmp = head;
        int posToDelete = length - n;
        int currentPosition = 0;
        if(posToDelete == 0){
            head = head.next;
            return head;
        } 
        while( tmp != null ){
            if( currentPosition == (posToDelete - 1) ){
                tmp.next = tmp.next.next;
                break;
            }
            tmp = tmp.next;
            currentPosition++;
        }
        
        return head;
    }
}