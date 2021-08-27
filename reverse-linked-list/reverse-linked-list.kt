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
    fun reverseList(head: ListNode?): ListNode? {
        
        var tmp = head
        var prev:ListNode? = null
        while(tmp != null){
            val next = tmp.next
            tmp.next = prev
            prev = tmp
            tmp = next
        }
        
        return prev
        
    }
}