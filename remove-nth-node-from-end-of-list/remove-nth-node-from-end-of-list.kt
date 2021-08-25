/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        
        var dummy = ListNode(-1)
        dummy.next = head
        
        var tmp = dummy.next
        var size = 0
        
        while(tmp != null){
            tmp = tmp.next
            size++
        }
        
        size -= n
        
        tmp = dummy
        while(size > 0){
            size--
            tmp = tmp.next
        }
        
        tmp.next = tmp.next.next
        
        return dummy.next
    }
}